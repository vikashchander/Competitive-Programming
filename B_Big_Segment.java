/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class B_Big_Segment {

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
         int min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;
         int[] arr1 = new int[n];
         int[] arr2 = new int[n];

         for(int i=0; i<n; i++){
             int x = scn.nextInt();
             int y = scn.nextInt();
             arr1[i] = x;
             arr2[i] =y;
             min = Math.min(min, x);
             max = Math.max(max,y);
         }
// System.out.println(min+" "+max);
           for(int i=0; i<n; i++){
               if(arr1[i] == min && arr2[i] == max){
                System.out.println(i+1);   
                return;
               }
           }
           System.out.println(-1);
        }

}