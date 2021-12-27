/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class B_Sail {

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
        int sx = scn.nextInt();
        int sy = scn.nextInt();
        int ex = scn.nextInt();
        int ey = scn.nextInt();
        String str = scn.nextLine();
        int count = -1;
        for (int i = 0; i < n; i++) {

            if (str.charAt(i) == 'E') {
                if (sx < ex) {
                    sx += 1;
                }
            } else if (str.charAt(i) == 'W') {
                if (sx > ex) {
                    sx -= 1;
                }
            } else if (str.charAt(i) == 'N') {
                if (sy < ey) {
                    sy += 1;
                }
            } else if (str.charAt(i) == 'S') {
                if (sy > ey) {
                    sy -= 1;
                }
            }

            if (sx == ex && sy == ey) {
                count = i + 1;
                break;
            }
        }
        if (count != -1) {
            System.out.println(count);
        } else
            System.out.println(-1);
    }

}
