/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class B_Alphabetical_Strings {

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
           String str= scn.next();
           int n =str.length();
           int i=0;
           int j=n-1;

           char ch = (char) ('a'+n-1);
          
          boolean ans =true;
           while(i<=j){
            // System.out.print(ch+" ->");
               if(str.charAt(i) ==ch){
                   i++;
                   ch--;
               }else if(str.charAt(j) == ch){
                   j--;
                   ch--;
               }else{
                   ans =false;
                   break;
               }
           }
            if(ans) System.out.println("YES");
            else System.out.println("NO");
        }
    }

}
