/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class TMT {

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
            String st = scan.next();
            String ans = "YES";
            int cm = 0, ct = 0, c = 0, fm = 0, lm = 0;
            for (int i = 0; i < n; i++) {
                if (st.charAt(i) == 'M') {
                    cm++;
                } else {
                    ct++;
                }
                if (cm > ct) {
                    ans = "NO";
                    break;
                }
            }
            cm = 0;
            ct = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (st.charAt(i) == 'M') {
                    cm++;

                } else {
                    ct++;
                }
                if (cm > ct) {
                    ans = "NO";
                    break;
                }

            }
            if (cm * 2 != ct)
                ans = "NO";
            System.out.println(ans);

        }
    }

    public static void problem(int[] arr, int n) {
        int sum = 0;
        // System.out.println(sum);
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1 || arr[i] == 3) {
                // System.out.println(arr[i] + " -> " + " ada ");
                sum = sum + 1;
            }
        }
        System.out.println(sum);

    }
}
