import java.io.*;
import java.util.*;

class strong {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();
            problem(n, k, str);
        }

    }

    public static void problem(int n, int k, String str) {
        int counter = 0;
        boolean res = false;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != '*') {
                counter = 0;
            } else if (str.charAt(i) == '*') {
                counter++;
            }
            if (counter == k) {
                // System.out.println("Yes");
                res = true;
                break;
            }
        }
        if (res) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
