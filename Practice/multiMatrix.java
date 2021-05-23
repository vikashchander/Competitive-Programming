/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class multiMatrix {

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
        FastReader in= new FastReader();
        int t = in.nextInt();
        while (t-- > 0) {
            int m, n, p, q, sum = 0, c, d, k;
 
            
            m = in.nextInt();
            n = in.nextInt();
         
            int first[][] = new int[m][n];
         
           
         
            for (c = 0; c < m; c++)
              for (d = 0; d < n; d++)
                first[c][d] = in.nextInt();
         
           
            p = in.nextInt();
            q = in.nextInt();
         
            if (n != p)
             System.out.println("-1");
            else
            {
              int second[][] = new int[p][q];
              int multiply[][] = new int[m][q];
         
              for (c = 0; c < p; c++)
                for (d = 0; d < q; d++)
                  second[c][d] = in.nextInt();
         
              for (c = 0; c < m; c++) {
                for (d = 0; d < q; d++) {
                  for (k = 0; k < p; k++)
                    sum = sum + first[c][k]*second[k][d];
         
                  multiply[c][d] = sum;
                  sum = 0;
                }
              }
         
                 
              for (c = 0; c < m; c++) {
                for (d = 0; d < q; d++)
                  System.out.print(multiply[c][d]+"\t");
         
                System.out.print("\n");
              }
            }
    }

}
}