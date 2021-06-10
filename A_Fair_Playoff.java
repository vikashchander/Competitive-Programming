/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class A_Fair_Playoff{

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
        while (test-- > 0) {
            int[] arr = new int[4];
            for(int i=0; i<4; i++){
                arr[i] = scan.nextInt();

            }
            int max1 = Math.max(arr[0],arr[1]);
            int min1 = Math.min(arr[0],arr[1]);
            int max2 = Math.max(arr[2],arr[3]);
            int min2 = Math.min(arr[2],arr[3]);
            if(min1<max2 && min2<max1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

            
        }
    }

   
}
