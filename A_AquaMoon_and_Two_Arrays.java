/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class A_AquaMoon_and_Two_Arrays {

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
            int n = scn.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            int sum1 = 0;
            int sum2 = 0;

            for (int i = 0; i < n; i++) {
                arr1[i] = scn.nextInt();
                sum1 += arr1[i];
            }

            for (int j = 0; j < n; j++) {
                arr2[j] = scn.nextInt();
                sum2 += arr2[j];
            }

            if (sum1 != sum2)
                System.out.println(-1);
            else {
                ArrayList<Integer> plus = new ArrayList<Integer>();
                ArrayList<Integer> minus = new ArrayList<Integer>();

                for (int i = 0; i < n; i++) {
                    int diff = Math.abs(arr1[i] - arr2[i]);
                    if (arr1[i] > arr2[i]) {
                        while (diff-- != 0) {
                            minus.add(i);
                        }
                    } else if (arr1[i] < arr2[i]) {
                        while (diff-- != 0) {
                            plus.add(i);
                        }
                    }
                }
                if (plus.size() != minus.size())
                    System.out.println(-1);
                else {
                    System.out.println(plus.size());
                    for (int i = 0; i < plus.size(); i++) {
                        System.out.println((minus.get(i) + 1) + " " + (plus.get(i) + 1));
                    }
                }
            }

        }
    }

}
