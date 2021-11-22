/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.text.DecimalFormat;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class B_Moamen_and_k_subarrays {

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
           int k  = scn.nextInt();

          int[] arr = new int[n];
           int[] b = new int[n];

          for(int i=0; i<n; i++){
              arr[i] = scn.nextInt();
              b[i] = arr[i];

          }

          int count =1;
          Arrays.sort(b);

          for(int i=0; i<n-1; i++){
              int x = arr[i];
              int data = Arrays.binarySearch(b, x);
              
              if(data == n-1 || arr[i+1] != b[data+1]) count++;
              
          }

            
            if(count <=k && k<=n){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }

}
