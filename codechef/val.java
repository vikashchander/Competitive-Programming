/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class val {

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
            int size = scan.nextInt();
            long[] a = new long[size];
            long[] b = new long[size];
            long maxA = Integer.MIN_VALUE;
            long sum = 0;
            for (int i = 0; i < size; i++) {
                a[i] = scan.nextInt();

            }
            for (int i = 0; i < size; i++) {
                b[i] = scan.nextInt();

            }
            Arrays.sort(a);
            Arrays.sort(b);
            int i = 0;
            int j = size - 1;
            while (j >= 0) {
                if (a[i] + b[j] > sum)
                    sum = a[i] + b[j];
                i++;
                j--;
            }
            System.out.println(sum);
        }
    }
}
