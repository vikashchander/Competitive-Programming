//package cchef;

import java.util.*;

public class A_Stones_on_the_Table{
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String str = input.next();

        char[] ch = str.toCharArray();
        // int  n = ch.length;
        int count =0;
        for(int i=1; i<n; i++){
            if(ch[i-1]==ch[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}


