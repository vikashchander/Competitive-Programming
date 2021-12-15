/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class A_Business_trip {

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
        FastReader scn = new FastReader();
        int n = scn.nextInt();

        int[] arr = new int[12];

        for (int i = 0; i < 12; i++) {
            arr[i] = scn.nextInt();
        }

        Arrays.sort(arr);

        long sum = 0;
        if (n == 0) {
            System.out.println(0);
            return;
        }
        for (int i = arr.length - 1; i > -1; i--) {
            sum += arr[i];
            if (sum >= n) {
                System.out.println(Math.abs(arr.length - i));
                return;
            }
        }
        System.out.println(-1);

    }
}
