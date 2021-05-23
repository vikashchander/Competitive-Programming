import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class non {

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
        // FastReader scan = new FastReader();
        // int t = scan.nextInt();

        int k = 1;
        int n = 5;
        int[] arr = { 3, -2, 1, 4, -3 };
        int sum = 0;
        int s = 0;
        int maxSum = 0;
        int localSum = 0;
        while (k > 0) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > localSum) {
                    localSum = Math.max(localSum + arr[i], arr[i]);

                } else {
                    localSum = Math.max(localSum + arr[i], arr[i]);
                }

                maxSum = Math.max(localSum, maxSum);
                sum = maxSum;
            }
            k--;
        }
        System.out.println(sum);

    }
}
