/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class string {

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

        String str = scan.nextLine();
        String res = "";
        String check = "aoyeuiAOYEUI";
        char[] chArr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (check.indexOf(chArr[i]) == -1) {
                res += chArr[i];

            }
        }

        String ans = "";
        for (int i = 0; i < res.length(); i++) {
            ans += "." + res.charAt(i);
        }
        System.out.println(ans.toLowerCase());
    }

}
