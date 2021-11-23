/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class B_Putting_Plates {

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
            int row = scn.nextInt();
            int col = scn.nextInt();
            
            int arr[][] = new int[row][col];
            arr[0][0] = 1;
            arr[row-1][col-1] = 1;
            arr[0][col-1] = 1;
            arr[row-1][0] = 1;
 
            int num = (int)Math.ceil(col/2.0);
            num -= 2;
            int i = 2;
            while(num > 0){
                arr[0][i] = 1;
                arr[row-1][i] = 1;
                i+=2;
                num--;
            }
 
            num = (int)Math.ceil(row/2.0);
 
            num -= 2;
            i = 2;
            while(num > 0){
                arr[i][0] = 1;
                arr[i][col-1] = 1;
                i += 2;
                num--;
            }
 
            for(int itr=0; itr<row; itr++){
                for(int j=0; j<col; j++){
                    System.out.print(arr[itr][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
