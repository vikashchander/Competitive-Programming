/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class A_Ultra_Fast_Mathematician {

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
        // String str1 = Integer.toString(val1);
        // String str2 = Integer.toString(val2);
        //  System.out.println(str1 +" "+str2);
        StringBuilder sb = new StringBuilder();
        int i=0, j=0;
        while(i<str1.length() && j<str2.length()){
            if(str1.charAt(i) == str2.charAt(j)){
                sb.append("0");
            }else{
                sb.append("1");
            }
            j++;
            i++;
        }
        System.out.println(sb.toString());
    }

}
