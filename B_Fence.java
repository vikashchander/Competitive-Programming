/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class B_Fence {

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
        int k = scn.nextInt();
        int[] arr = new int[n + 3];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();

        }
        int sum = 0;
        int res = 1;
        for (int i = 0; i < k; i++)
            sum += arr[i];
        int temp = sum;
        for (int i = k; i < n; i++) {
            temp -= arr[i - k];
            System.out.println(temp + " .adad");
            temp += arr[i];
            System.out.println(temp + " daa");
            // out.println(temp + " " + sum + " " + i);
            if (temp < sum) {
                sum = temp;
                res = i - k + 2;
            }
        }
        System.out.println(res);
    }

}
