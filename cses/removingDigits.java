/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class removingDigits {

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

        int num = scan.nextInt();

        problem(num);

    }

    public static void problem(int num) {
        int dp[] = new int[num + 1];

        dp[0] = 0;
        for (int i = 1; i <= num; i++) {
            int temp = i;
            int minSteps = Integer.MAX_VALUE;
            while (temp != 0) {
                int sd = temp % 10;
                temp /= 10;
                if (sd == 0)
                    continue;
                minSteps = Math.min(minSteps, 1 + dp[i - sd]);
            }
            dp[i] = minSteps;
        }
        System.out.println(dp[num]);
    }
}
