/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class andSequence {
    static long mod = 1_000_000_007;

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

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            int ans = arr[0];
            for (int i : arr) {
                System.out.println(ans + "->" + (ans &= i));
                ans &= i;
            }
            int count = 0;
            for (int i : arr) {
                if (i == ans) {
                    count++;
                }
            }
            long res = count * (long) (count - 1) % mod;
            System.out.println(res + "-> result");
            for (int i = n - 2; i > 0; i--) {
                res = (res * i) % mod;
                System.out.println(res + "-> inside loop");
            }
            System.out.println(res);
        }
    }
}
