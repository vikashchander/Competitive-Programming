/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class A_Football {

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

        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = scn.next();
        }
        int c1 = 1;
        int c2 =0;
        String res = str[0];
        String data ="";
        for(int i=1; i<n; i++){
            if(res.equals(str[i])){
                c1++;
            }else{
                data = str[i];
                c2++;
            }
        }

        if(c1>c2){
            System.out.println(res);
        }else{
             System.out.println(data);
        }

    }
}
