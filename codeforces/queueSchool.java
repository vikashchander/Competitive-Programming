/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class queueSchool {

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

        int len = scan.nextInt();
        int time = scan.nextInt();
        StringBuilder sb = new StringBuilder(scan.nextLine());

        while (time-- != 0) {
            for (int i = 0; i < len - 1; i++) {
                if (sb.charAt(i) == 'B' && sb.charAt(i + 1) == 'G') {
                    sb.setCharAt(i, 'G');

                    sb.setCharAt(i + 1, 'B');
                    i++;
                }
            }

        }
        System.out.println(sb.toString());
    }
}
