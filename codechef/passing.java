/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class passing {

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
            int[] arr = new int[7];
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < 7; i++) {
                arr[i] = scan.nextInt();

            }
            // System.out.println(sum1 + " -> " + sum2);
            if (arr[0] > arr[4] || arr[1] > arr[5] || arr[2] > arr[6] || arr[4] + arr[5] + arr[6] < arr[3])
                System.out.println("NO");
            else
                System.out.println("YES");

        }
    }

}
