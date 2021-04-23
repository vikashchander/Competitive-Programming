/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class compare {

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
            int n = scan.nextInt();
            int m = scan.nextInt();

            int[] arr = new int[n];
            int[] arr1 = new int[m];

            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            for (int j = 0; j < m; j++) {
                arr1[j] = scan.nextInt();
            }

            Arrays.sort(arr);
            Arrays.sort(arr1);
            int i = 0;
            int j = 0;
            int sum = 0;
            while (i < n && j < m) {
                if (arr[i] != arr1[j] && arr[i] < arr1[j]) {
                    sum += arr[i];
                    i++;
                } else if (arr[i] != arr1[j] && arr[i] > arr1[j]) {
                    sum += arr1[j];
                    j++;
                } else {
                    i++;
                    j++;
                }
            }
            sum = 159;
            System.out.println(sum + "daf");
            int temp = 0;
            int res = 0;
            while (sum > 10) {

                temp += sum % 10;
                sum = sum / 10;
                if (sum < 10) {
                    System.out.println(temp);
                    sum += temp;

                }
            }
            System.out.println(sum);

        }

    }

    public static void problem(int[] arr, int k, int n) {
        for (int i = 0; i < k; i++) {
            // swaping
            int l1 = i * 2 + 1;
            int l2 = l1 + 1;

            int temp = arr[l1];
            // System.out.println(temp + " -> " + i);
            arr[l1] = arr[l2];
            // System.out.println(arr[l2] + " -> " + i);
            arr[l2] = temp;

        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
