/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class movie {

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
            int x = scan.nextInt();
            int S[] = new int[n];
            int R[] = new int[n];
            for (int i = 0; i < n; i++) {
                S[i] = scan.nextInt();
                R[i] = scan.nextInt();
            }
            problem(n, x, S, R);

        }
    }

    public static void problem(int n, int x, int[] S, int[] R) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (S[i] > x) {
                continue;
            }
            res = Math.max(res, R[i]);

        }
        System.out.println(res);
    }
}
