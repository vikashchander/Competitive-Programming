/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class xor {
  
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
            long n = scan.nextLong();

            long x = 2;
            long y = n-1;
            long p = 1000000007;
            long ans= utils(x, y, p);
            System.out.println(ans);
        }
    }

    public static long utils(long x, long y, long p){
        long res =1;
        x = x%p;
        if(x==0){
          return  0;

        }
        
        while (y)
        {
            if (y & 1)// if y is odd
                res = (res*x) % p;
            y = y>>1; // dividing by 2
            x = (x*x) % p;
        }
        return res;
    }

  
}
