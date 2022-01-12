
/* package codechef; // don't place package name! */
import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class A_Dragons {

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
        int s = scn.nextInt();
        int n = scn.nextInt();

        Dragon[] dragons = new Dragon[n];

        for (int i = 0; i < n; i++) {
            Dragon d = new Dragon();
            d.str = scn.nextInt();
            d.bon = scn.nextInt();
            dragons[i] = d;
        }

        Arrays.sort(dragons);
        boolean ok = true;

        for (int i = 0; i < n && ok; i++) {
            if (s > dragons[i].str) {
                s += dragons[i].bon;
            } else {
                ok = false;
            }
        }

        String ans = ok ? "YES" : "NO";

        System.out.println(ans);
    }

    public static class Dragon implements Comparable<Dragon> {
        int str;
        int bon;

        public int compareTo(Dragon o) {
            return this.str - o.str;
        }
    }
}