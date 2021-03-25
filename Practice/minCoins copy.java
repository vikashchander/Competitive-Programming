/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class minCoins {

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
        int amt = scan.nextInt();
        int[] coins = new int[num];
        for (int i = 0; i < num; i++) {
            coins[i] = scan.nextInt();
        }
        int res = problem(num, amt, coins);
        System.out.println(res);
    }

    public static int problem(int num, int amt, int[] coins) {
        int[] dp = new int[amt + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] > i) {
                    continue;
                }
                if (dp[i - coins[j]] == Integer.MAX_VALUE)
                    continue;
                dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
            }
        }
        return (dp[dp.length - 1] == Integer.MAX_VALUE ? -1 : dp[dp.length - 1]);
    }
}
