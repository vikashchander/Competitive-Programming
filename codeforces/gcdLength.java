import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class gcdLength extends Functions {
    public static void solve() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long res1 = (long) Math.pow(10, a - 1);
        long res2 = (long) Math.pow(10, b - 1);
        long res3 = (long) Math.pow(10, c - 1);
        System.out.println(res1 + " " + (res2 + res3));
        // System.out.println(gcd(res1, res2 + res3) + " dsfsd");
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int testCase = 1;
        testCase = sc.nextInt();
        while (testCase-- > 0) {
            solve();
        }
        long end = System.currentTimeMillis();
        // System.out.println("time took in ms : "+(end-start));
    }

    static Scanner sc = new Scanner();

}

class Functions {
    public static int mod = (int) 1e9 + 7;
    public static int INT_MAX = Integer.MAX_VALUE;
    public static int INT_MIN = Integer.MIN_VALUE;
    public static long LONG_MAX = Long.MAX_VALUE;
    public static long LONG_MIN = Long.MIN_VALUE;
    public static double DOUBLE_MAX = Double.MAX_VALUE;
    public static double DOUBLE_MIN = Double.MIN_VALUE;

    public static void sort(int[] a, boolean isAscending) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int j : a)
            temp.add(j);
        sort(temp, isAscending);
        for (int i = 0; i < a.length; i++)
            a[i] = temp.get(i);
    }

    public static void sort(List T, boolean isAscending) {
        if (isAscending)
            Collections.sort(T);
        else
            Collections.sort(T, Collections.reverseOrder());
    }

    public static long factorial(int n) {
        long fact = 1L;
        for (int i = 2; i <= n; i++)
            fact = (fact * i) % mod;
        return fact;
    }

    public static int ncr(int n, int r) {
        // time O(n+r)
        if (r > n)
            return 0;
        long[] inv = new long[r + 1];
        inv[1] = 1;
        // Getting the modular inversion
        // for all the numbers
        // from 2 to r with respect to m
        for (int i = 2; i <= r; i++) {
            inv[i] = mod - (mod / i) * inv[(int) (mod % i)] % mod;
        }
        int ans = 1;
        // for 1/(r!) part
        for (int i = 2; i <= r; i++) {
            ans = (int) (((ans % mod) * (inv[i] % mod)) % mod);
        }
        // for (n)*(n-1)*(n-2)*...*(n-r+1) part
        for (int i = n; i >= (n - r + 1); i--) {
            ans = (int) (((ans % mod) * (i % mod)) % mod);
        }
        return ans;
    }

    public static void reverseArray(int[] a) {
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }

    public static long isPrime(int n) {
        for (long i = 2; i * i <= n; i++)
            if (n % i == 0)
                return i;
        return -1;
    }

    public static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}

class Scanner {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st = new StringTokenizer("");

    public String next() {
        while (!st.hasMoreTokens())
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        return st.nextToken();

    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public int[] setIntArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = nextInt();
        return arr;
    }

    public Integer[] setIntegerArray(int n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++)
            arr[i] = nextInt();
        return arr;
    }

    public long[] setlongArray(int n) {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++)
            arr[i] = nextLong();
        return arr;
    }

    public int[][] set2DIntegerMatrix(int row, int col) {
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                arr[i][j] = nextInt();
        return arr;
    }
}