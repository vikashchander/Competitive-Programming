/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class B_Borze {

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
        String test = scn.nextLine();
        int n = test.length();
        StringBuilder sb = new StringBuilder();

        String str ="";

        for (int i = 0; i < n; i++) {
           if(test.charAt(i)=='.'){
               str += '0';
           }else if(test.charAt(i)=='-' && test.charAt(i+1)=='.'){
                 str +='1';
                 ++i;
           }else if(test.charAt(i)=='-' && test.charAt(i+1)=='-'){
               str +='2';
               ++i;
           }
        }

        System.out.print(str);
    }

}
