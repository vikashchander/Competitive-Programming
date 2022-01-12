/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class A_Supercentral_Point {

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
        int test = scan.nextInt();
        int[] x_axis = new int[test];
        int[] y_axis = new int[test];

        for (int i = 0; i < test; i++) {
            x_axis[i] = scan.nextInt();
            y_axis[i] = scan.nextInt();

        }

        int count = 0;
        for (int i = 0; i < test; i++) {
            boolean l = false;
            boolean r = false;
            boolean t = false;
            boolean b = false;

            for (int j = 0; j < test; j++) {
                if (x_axis[i] > x_axis[j] && y_axis[i] == y_axis[j])
                    l = true;
                if (x_axis[i] < x_axis[j] && y_axis[i] == y_axis[j])
                    r = true;
                if (x_axis[i] == x_axis[j] && y_axis[i] > y_axis[j])
                    b= true;
                if (x_axis[i] == x_axis[j] && y_axis[i] < y_axis[j])
                    t = true;

               
            } if (l && r && t && b) {
                count++;
            }

        }
        System.out.println(count);
    }
}
