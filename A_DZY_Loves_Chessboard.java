
/* package codechef; // don't place package name! */
import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class A_DZY_Loves_Chessboard {

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
        int m = scn.nextInt();

        char[][] mat = new char[n][m];

        for (int i = 0; i < n; i++) {
            String s = scn.next();
            mat[i] = s.toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (mat[i][j] == '.') {
                    if ((i + j) % 2 == 0) {
                        mat[i][j] = 'B';
                    } else {
                        mat[i][j] = 'W';
                    }
                }

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + "");
            }
            System.out.println("");
        }

    }
}