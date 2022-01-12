/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class B_Pashmak_and_Flowers {

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
        int[] beauty = new int[n];
        for (int i = 0; i < n; i++) {
            beauty[i] = scn.nextInt();
        }

        Arrays.sort(beauty);

        long tn = 0, tx = 0;
        int min = beauty[0];
        int max = beauty[n - 1];
        int difference = max - min;

        for (int i = 0; i < beauty.length; i++) {
            if (beauty[i] == min)
                tn++;
            if (beauty[i] == max)
                tx++;
        }

        if (tn == tx && tn == n) {
            long nn = n;
            long comb = nn * (nn - 1) / 2;
            System.out.println(difference + " " + comb);
        } else {
            long comb = tn * tx;
            System.out.println(difference + " " + comb);
        }

    }

}
