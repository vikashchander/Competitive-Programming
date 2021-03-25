/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class diljitDosanjh {

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
            int sn = scan.nextInt();
            int remove = scan.nextInt();

            LinkedList<Integer> Friend = new LinkedList<>();
            for (int i = 0; i < sn; i++) {
                int val = scan.nextInt();
                Friend.add(val);
            }
            removeFrd(Friend, remove);
            for (int ele : Friend)
                System.out.print(ele + " ");
            System.out.println("");
        }

    }

    public static void removeFrd(LinkedList<Integer> Friend, int remove) {
        int x = 0;
        for (int i = 1; i < Friend.size(); i++) {
            if (Friend.get(i - 1) < Friend.get(i)) {
                Friend.remove(i - 1);
                i--;
                ++x;

                // DeleteFriend = true;
                // break;
            }
            // System.out.println(x + "dfasd");
            if (x == remove) {
                break;
            }

        }
        if (x < remove) {
            while (x != remove) {
                Friend.removeFirst();
                x++;
            }
        }

    }
}