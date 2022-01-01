/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class B_Shower_Line {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static int max = 0;
    static int[][] arr = new int[5][5];

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        FastReader scn = new FastReader();

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                arr[i][j] = scn.nextInt();
        String str = "12345";
        GeneratePer(str, 0, str.length());
        System.out.println(max);
    }

    public static void GeneratePer(String str, int start, int end) {
        if (start == end - 1) {
            char[] str1 = str.toCharArray();
            int sum = arr[Character.getNumericValue(str1[0]) - 1][Character.getNumericValue(str1[1]) - 1]
                    + 2 * (arr[Character.getNumericValue(str1[2]) - 1][Character.getNumericValue(str1[3]) - 1])
                    + 2 * (arr[Character.getNumericValue(str1[3]) - 1][Character.getNumericValue(str1[4]) - 1])
                    + arr[Character.getNumericValue(str1[1]) - 1][Character.getNumericValue(str1[2]) - 1];
            sum += arr[Character.getNumericValue(str1[1]) - 1][Character.getNumericValue(str1[0]) - 1]
                    + 2 * (arr[Character.getNumericValue(str1[3]) - 1][Character.getNumericValue(str1[2]) - 1])
                    + 2 * (arr[Character.getNumericValue(str1[4]) - 1][Character.getNumericValue(str1[3]) - 1])
                    + arr[Character.getNumericValue(str1[2]) - 1][Character.getNumericValue(str1[1]) - 1];
            // System.out.println(sum);
            if (sum > max)
                max = sum;
        } else {
            for (int i = start; i < end; i++) {
                str = swap(str, start, i);
                GeneratePer(str, start + 1, end);
                str = swap(str, start, i);
            }
        }
    }

    public static String swap(String str, int i, int j) {
        char[] str1 = str.toCharArray();
        char temp = str1[i];
        str1[i] = str1[j];
        str1[j] = temp;
        return String.valueOf(str1);
    }
}
