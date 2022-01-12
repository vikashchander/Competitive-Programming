/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class B_Letter {

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

    static int max = 0;
    static int[][] arr = new int[5][5];

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        FastReader scn = new FastReader();
        String str = scn.nextLine().trim();
        String val = scn.nextLine().trim();
        str = str.replaceAll("\\s", "");
        val = val.replaceAll("\\s", "");
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
        }
        // System.out.println(val);
        for (int i = 0; i < val.length(); i++) {
            // System.out.println(val.charAt(i));
            if (!hm.containsKey(val.charAt(i))) {
                System.out.println("NO");
                return;
            } else {
                if (hm.get(val.charAt(i)) <= 0) {
                    System.out.println("NO");
                    return;
                }
                // System.out.println(hm.get(val.charAt(i)));
                hm.put(val.charAt(i), hm.get(val.charAt(i)) - 1);
            }
        }

        System.out.println("YES");
    }

}
