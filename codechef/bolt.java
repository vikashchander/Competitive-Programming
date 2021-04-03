import java.io.*;
import java.util.*;

class bolt {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int t = sc.nextInt();
        while (t-- > 0) {
            double k1 = sc.nextFloat();
            double k2 = sc.nextFloat();
            double k3 = sc.nextFloat();
            double v = sc.nextFloat();

            problem(k1, k2, k3, v);
        }

    }

    public static void problem(double k1, double k2, double k3, double v) {
        final int race = 100;
        double time = k1 * k2 * k3 * v;
        double res = race / time;
        double ans = Math.round(res * 100) / 100.0;
        // System.out.println(ans);
        if (ans < 9.58)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

}
