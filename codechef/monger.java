/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class monger {

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
            int n = scan.nextInt();
            int x = scan.nextInt();
            long arr[] = new long[n];
            int count = 0;
            int sum = 0;
            HashMap<Long, Integer> hs = new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextLong();
                hs.put(arr[i], hs.getOrDefault(arr[i], 0) + 1);
            }
            for (Map.Entry<Long, Integer> e : hs.entrySet()) {
                // System.out.println(e.getKey() + "->" + e.getValue());
                sum += e.getValue() - 1;
            }
            if (sum < x) {
                System.out.println(hs.size() - x + sum);
            } else {
                System.out.println(hs.size());
            }

        }
    }

}
