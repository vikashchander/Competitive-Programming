/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class iss {
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

            int n =(int) 4e6+7;
            int data[]= new int[n];
            int res[] = new int[n];
 for(int i=0; i<n; i++){
  data[i] = i;
  res[i] = 0;
 }
 for(int i=2; i<n; i++){
  if(data[i] == i){
   data[i] = i-1;
   for(int j=2*i; j<n; j+=i)
    data[j] = (data[j]/i) * (i-1);
  }
 }
 for(int i=1; i<n; i++){
  res[i] += i-1;
  for(int j=2*i; j<n; j+=i){
   res[j] += i * ( (1+data[j/i]) / 2);
  }
 }
   int k = scan.nextInt();
 System.out.println(res[4*k+1]);

        }
    }

    public static int gcd(int a, int b) {
        // GCD(0, b) == b; GCD(a, 0) == a,
        // GCD(0, 0) == 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // Finding K, where K is the greatest
        // power of 2 that divides both a and b
        int k;
        for (k = 0; ((a | b) & 1) == 0; ++k) {
            a >>= 1;
            b >>= 1;
        }

        // Dividing a by 2 until a becomes odd
        while ((a & 1) == 0)
            a >>= 1;

        // From here on, 'a' is always odd.
        do {
            // If b is even, remove
            // all factor of 2 in b
            while ((b & 1) == 0)
                b >>= 1;

            // Now a and b are both odd. Swap
            // if necessary so a <= b, then set
            // b = b - a (which is even)
            if (a > b) {
                // Swap u and v.
                int temp = a;
                a = b;
                b = temp;
            }

            b = (b - a);
        } while (b != 0);

        // restore common factors of 2
        return a << k;
    }
}
