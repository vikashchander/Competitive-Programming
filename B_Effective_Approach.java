/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class B_Effective_Approach {

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
        int[] arr = new int[100001];
        for (int i = 1; i <= n; i++) {
            int val = scn.nextInt();
            arr[val] = i;
        }

        int m = scn.nextInt();
        long ans1 = 0;
        long ans2 = 0;
        while (m-- > 0) {
            int b = scn.nextInt();
            ans1 += arr[b];
            ans2 += (n + 1 - arr[b]);
        }
        System.out.println(ans1 + " " + ans2);
    }

}
