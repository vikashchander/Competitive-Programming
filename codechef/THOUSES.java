/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class THOUSES {
    public static class Node {
        int data = 0;
        ArrayList<Node> childs = new ArrayList();;

        Node(int data) {
            this.data = data;
        }
    }

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
        int t = scan.nextInt();
        while (t-- > 0) {
            int total = scan.nextInt();
            int val = scan.nextInt();
            Node root = new Node(total, val);
            for(int i=0; i<total; i++)

        }
    }

    public static void problem(int x, int r, int m) {
        r = r * 60;
        m = m * 60;
        if (m < r) {
            System.out.println("No");
        } else if (r > x) {
            r = r - x;
            m = m - x;
            if (2 * r <= m) {
                System.out.println("Yes");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("Yes");
        }

    }
}
