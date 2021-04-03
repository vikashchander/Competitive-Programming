import java.io.*;
import java.util.*;

class dice {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int t = sc.nextInt();
        while (t-- > 0) {
            long diceStack = sc.nextLong();
            problem(diceStack);
        }

    }

    public static void problem(long stack) {
        int dp[] = new int[(int) stack + 1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i < stack; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(stack * 21 - dp[(int) stack]);
    }

}
