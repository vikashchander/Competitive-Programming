/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class iss {
    public static class Node {
        int data = 0;
        ArrayList<Node> childs = new ArrayList();;

        Node(int data) {
            this.data = data;
        }
    }

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
            int k = scan.nextInt();
            int size = 2 * k + 1;
            // System.out.println(size + "->>");
            long[] arr = new long[size];
            long sum = 0;

            for (int i = 0; i < size; i++) {
                arr[i] = k + (long) Math.pow(i + 1, 2);
                System.out.println(arr[i] + "->>");
            }
            for (int i = 1; i < arr.length; i++) {
                sum += gcdExtended(arr[i - 1], arr[i], 1, 1);
            }
            System.out.println(sum);

        }
    }

    public static long gcdExtended(long a, long b, long x, long y) {
        // Base Case
        if (a == 0) {
            x = 0;
            y = 1;
            return b;
        }

        long x1 = 1, y1 = 1; // To store results of recursive call
        long gcd = gcdExtended(b % a, a, x1, y1);

        // Update x and y using results of recursive
        // call
        x = y1 - (b / a) * x1;
        y = x1;

        return gcd;
    }

}
