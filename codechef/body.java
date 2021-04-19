/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class body {

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
        FastReader scan = new FastReader();
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int r = scan.nextInt();
            long arr[] = new long[n];
            long arr1[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextLong();
            }
            for (int i = 0; i < n; i++) {
                arr1[i] = scan.nextLong();
            }
            long temp = arr1[0];
            long ans = arr1[0];
            for (int i = 1; i < n; i++) {
                long res = arr[i] - arr[i - 1];
                temp = Math.max(0, temp - r * res);
                temp += arr1[i];
                ans = Math.max(ans, temp);
            }
            System.out.println(ans);
        }
    }

}
