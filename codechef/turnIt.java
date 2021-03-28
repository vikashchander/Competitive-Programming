/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class turnIt {

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
            int u = scan.nextInt();
            int v = scan.nextInt();
            int a = scan.nextInt();
            int s = scan.nextInt();
            problem(u, v, a, s);
        }
    }

    public static void problem(int u, int v, int a, int s) {

        int res = u * u - (2 * a * s);
        if (u == v) {
            System.out.println("Yes");
        } else if (res <= v * v) {
            // System.out.println(exp + "dsf");
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
