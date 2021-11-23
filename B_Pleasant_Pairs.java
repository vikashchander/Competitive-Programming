/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.text.DecimalFormat;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class B_Pleasant_Pairs {

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
            int n = scn.nextInt();
            long[] arr = new long[n+1];

            for(int i=1;i<n+1;i++){
                arr[i] = scn.nextLong();
            }
           int ans =0;
           
           for(int i=1; i<=n; i++){
               
                for (int j = (int)arr[i] - i; j <= n; j += arr[i]) {
                    if (i < j)
                        if (((arr[i] * arr[j]) == (i + j)))
                            ans++;
                }
           }
           System.out.println(ans);

        }
    }

}
