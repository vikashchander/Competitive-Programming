/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class dice {

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

    public static void main(String[] args) throws IOException {
        // your code goes here
        try {
            // Your Solve
            FastReader scan = new FastReader();
            int t = scan.nextInt();
            while (t-- > 0) {
                Long diceStack = scan.nextLong();
                problem(diceStack);
            }
        } catch (Exception e) {
            return;
        }

    }

    public static void problem(long n) {

        // System.out.println(n);

        System.out.println("dsfasd");
        if (n < 5) {
            System.out.println(n);
            // System.out.println(dp[(int) n]);
        }
    }
}
