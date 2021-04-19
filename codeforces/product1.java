/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class product1 {

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
        int n = scan.nextInt();
        List<Integer> ls = new ArrayList();
        ls.add(1);
        long mul = 1;
        for (int i = 2; i < n - 1; i++) {
            if (gcd(i, n) == 1) {
                ls.add(i);
                mul *= i;
                mul %= n;
                // System.out.println("line 1 " + i + " " + mul + " " + mul % n);
            }
        }

        // System.out.println("line 2 " + mul + " " + mul % n);
        if (n > 2) {

            // System.out.println((mul * (n - 1)) % n + " line 3 ");

            if ((mul * (n - 1)) % n == 1) {
                ls.add(n - 1);
                // System.out.println(n - 1 + " line 4 ");
            }
        }
        System.out.println(ls.size());
        for (int i : ls) {
            System.out.print(i + " ");
        }

    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);

    }
}
