/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class A_Beautiful_Year {

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

        for (int data = ++test; data < 9999; data++) {
            if (check(data)) {
                System.out.println(data);
                break;
            }
            // System.out.println(data);
        }

    }

    public static boolean check(int test) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            int val = test%10;
            test/=10;
            hs.add(val);
        }
        if (hs.size() == 4) {
           
            return true;
        }else{
            hs.clear();
         return false;   
        }
    }

}
