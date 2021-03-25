/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class youngPhy {

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
        // int t = scan.nextInt();
        int n = scan.nextInt();
        int x = 0;
        int y = 0;
        int z = 0;

        for (int i = 0; i < n; i++) {

            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            x += a;
            y += b;
            z += c;

        }
        // System.out.println(sum);

        if (x == 0 && y == 0 && z == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}