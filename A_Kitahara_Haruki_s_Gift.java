import java.util.*;

public class A_Kitahara_Haruki_s_Gift {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        int a = 0, b = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            if (arr[i] == 100)
                a++;
            else
                b++;
        }
        int sum = 100 * a + 200 * b;
        if (sum % 200 != 0) {
            System.out.println("NO");
            return;
        }
        if (n == 1) {
            System.out.println("NO");
            return;
        } else if (sum % 200 != 0) {
            System.out.println("NO");
            return;
        } else {
            int half = sum / 2;
            boolean ans = false;
            for (int i = 0; i <= b; i++) {
                if (200 * i <= half && half - 200 * i <= a * 100) {
                    ans = true;
                }

            }
            if (ans)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}