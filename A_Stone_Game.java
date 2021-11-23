/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class A_Stone_Game{

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
        FastReader scn= new FastReader();
        int test = scn.nextInt();
        while (test-- > 0) {
            int n = scn.nextInt();
            int minEle =0;
            int maxEle =0;
            for(int i=0; i<n; i++){
                int val= scn.nextInt();
                if(val == 1){
                    minEle = i;
                }else if(val ==n){
                    maxEle = i;
                }
            }

           int min1 = Math.min(minEle, maxEle);
           int max1 = Math.max(minEle, maxEle);
           int ans1=  n-min1; // right to left
           int ans2 = max1+1;  // left  to right
           int ans3 = min1+ 1+n -max1; // one left and then right remove so on ...
           int res = Math.min(ans1,Math.min(ans2,ans3));
           System.out.println(res);
        
            
        }
    }

   
}
