/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class A_Yaroslav_and_Permutations {

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
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int res = 0;

        for (int i = 0; i < n; i++) {
            int ptr = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    ptr++;
                }
                if (ptr > res) {
                    res = ptr;
                }
            }
        }

        if (n % 2 == 0) {
            if (res <= (n / 2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            if (res <= (n / 2) + 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

}
