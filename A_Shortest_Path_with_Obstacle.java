/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class A_Shortest_Path_with_Obstacle {

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
            int a,b,c,d,e,f;
            a =  scn.nextInt();
            b = scn.nextInt();
            c = scn.nextInt();
            d = scn.nextInt();
            e = scn.nextInt();
            f = scn.nextInt();

            int ans = Math.abs(a-c)+ Math.abs(b-d);

            if(a==c){
                if(e==a && f>= Math.min(b,d) && f<= Math.max(b,d)){
                     ans +=2;
                }
            }
            if(b==d){
            if(f==b && e>= Math.min(a,c) && e<= Math.max(a,c)){
                ans +=2;
            }
            }
            System.out.println(ans);

        }
    }

}
