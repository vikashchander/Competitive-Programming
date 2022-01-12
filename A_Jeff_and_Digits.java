/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class A_Jeff_and_Digits {

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

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        FastReader scn = new FastReader();
        int n = scn.nextInt();

        int[] arr = new int[n];
        int zeros = 0;
        int five = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            if (arr[i] == 0) {
                zeros++;
            } else if (arr[i] == 5) {
                five++;
            }
        }

        if (zeros == 0) {
            System.out.println(-1);
        } else if (five < 9) {
            System.out.println(0);
        } else {
            five -= five % 9;
            for (int i = 0; i < five; i++) {
                System.out.print(5);
            }
            for (int i = 0; i < zeros; i++)
                System.out.print(0);
        }
    }
}
