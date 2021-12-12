/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class A_Translation{

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
        String str1 = scn.next();
        String str2 = scn.next();
        int i = 0;
        int j = str1.length()-1;
        int m = 0; 
        int n = str2.length()-1;
        boolean checker = false;
        if(str1.length() != str2.length()){
             System.out.print("NO");
        }else{
           while(i<str1.length() && m<str2.length()){
            if(str1.charAt(i) != str2.charAt(n) || str1.charAt(j) != str2.charAt(m)){
                System.out.println("NO");
                checker = true;
                break;
            }
               if(str1.charAt(i) == str2.charAt(n)){
                  i++;
                  n--;
               }else if(str1.charAt(j)  == str2.charAt(m)) {
                  j--;
                  m++;
               }

               
           }

           if(!checker){
               System.out.println("YES");
           }
        }

    }
}
