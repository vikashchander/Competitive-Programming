/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class B_Xenia_and_Ringroad{

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
        int m = scn.nextInt();

        int[] arr = new int[m];
        for(int i=0; i<m; i++){
            arr[i] = scn.nextInt();
        } 
            int curr = 1;
            long ans = 0;
            for(int i = 0; i < m; i++){
                if(curr <= arr[i]){
                    ans += arr[i] - curr;
                }
                else{
                    ans += n - curr + arr[i];
                }
                curr = arr[i];
            }
 
            System.out.println(ans);
    }

}
