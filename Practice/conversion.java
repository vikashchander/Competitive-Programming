import java.util.Scanner;

public class conversion {
    public static Scanner scn = new Scanner(System.in);

    public static long anyBaseToDecimal(long n, long b) {
        long res = 0, pow = 1;
        while (n != 0) {
            long rem = n % 10;
            n /= 10;

            res += rem * pow;
            pow *= b;
        }

        return res;
    }

    public static long decimalToAnyBase(long n, long b) {
        long res = 0, pow = 1;
        while (n != 0) {
            long rem = n % b;
            n /= b;

            res += rem * pow;
            pow *= 10;
        }

        return res;
    }

    public static void main(String[] args) {
        int sn = scn.nextInt();
        int sb = scn.nextInt();
        int db = scn.nextInt();
        long res = anyBaseToDecimal(sn, sb);
        System.out.println(decimalToAnyBase(res, db));
    }
}