/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class partialReplacement {

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
        int test = scan.nextInt();
        while (test-- > 0) {
            int len = scan.nextInt();
            int k = scan.nextInt();
            StringBuilder sb = new StringBuilder(scan.nextLine());

            problem(len, k, sb);
        }
    }

    public static void problem(int len, int k, StringBuilder str) {
        int res = 0;
        if (str.charAt(0) == '*' || str.charAt(len - 1) == '*') {
            str.setCharAt(0, 'x');
            str.setCharAt(len - 1, 'x');
            res++;
        }
        if (str.charAt(0) == '*' && str.charAt(len - 1) == '*') {
            str.setCharAt(0, 'x');
            str.setCharAt(len - 1, 'x');
            res = res + 2;
        }

        for (int i = 1; i < len - 1; i++) {
            for (int j = len - 1; j > i; j--) {
                if (str.charAt(i) == '*' && str.charAt(j) == '*' && j - i < k) {
                    str.setCharAt(i, 'x');

                    str.setCharAt(j, 'x');
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
