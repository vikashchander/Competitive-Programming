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
        String str = scn.next();
 
        char[] ch = str.toCharArray();
 
        if (ch.length < 7) {
            System.out.println("NO");
            return;
        }
        int count = 1;
        boolean check = true;
        char prev = ch[0];
        for (int i = 1; i < ch.length; i++) {
            if (ch[i] == prev) {
                count++;
            } else {
                count = 1;
            }
            if (count == 7) {
                System.out.println("YES");
                check = false;
                return;
            }
            prev = ch[i];
        }
       if(check)
        System.out.println("NO");
    }
 
}