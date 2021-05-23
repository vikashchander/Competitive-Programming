/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class beans {

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
            long r = scan.nextInt();
            long b = scan.nextLong();
            long d = scan.nextLong();
            long res = r % b;
            if (r > b) {
                long temp = r;
                r = b;
                b = temp;
            }
            if ((b + r - 1) / r - 1 <= d) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }

    public static void problem(int[] arr, int k, int n) {
        for (int i = 0; i < k; i++) {
            // swaping
            int l1 = i * 2 + 1;
            int l2 = l1 + 1;

            int temp = arr[l1];
            // System.out.println(temp + " -> " + i);
            arr[l1] = arr[l2];
            // System.out.println(arr[l2] + " -> " + i);
            arr[l2] = temp;

        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
