/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class B1_Wonderful_Coloring_1 {

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
        int test = scn.nextInt();

        while (test-- > 0) {
            // System.out.print(test+" ");
            String str = scn.nextLine();

            HashMap<Character, Integer> hm = new HashMap<>();

            for (int i = 0; i < str.length(); i++) {
                hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
            }

            int ones = 0;
            int extra = 0;

            for (int i : hm.values()) {

                if (i == 1) {
                    ones++;
                } else if (i >= 2) {
                    extra++;
                }
            }

            System.out.println(extra + ones / 2);
        }
    }

}
