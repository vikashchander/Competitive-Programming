/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class fiboPatterns {

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
        int val = scan.nextInt();
        problem(val);
    }

    public static void fiboFun(int f[], int size) {
        f[1] = 1;
        f[2] = 1;

        for (int i = 3; i <= size; i++)

            // Add the previous 2 numbers
            // in the series and store it
            f[i] = f[i - 1] + f[i - 2];
    }

    public static void problem(int n) {
        int N = n * (n + 1) / 2;
        int f[] = new int[N + 1];
        fiboFun(f, N);

        int fiboNum = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++)
                System.out.print(f[fiboNum++] + " ");

            System.out.println();
        }
    }

}
