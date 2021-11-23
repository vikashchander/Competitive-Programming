//package cchef;

import java.util.*;

public class A_Nearly_Lucky_Number {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        func(n);
        if (count == 4 || count == 7) System.out.println("YES");
        else
            System.out.println("NO");








    }
    static long count = 0;
    static void func(long n){
        if (n==0){
            return;
        }
        if (n%10 == 4 || n%10 == 7){
            count++;
        }
        func(n/10);
    }
}


