//package cchef;

import java.util.*;

public class A_Perfect_Permutation {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          if(n%2 ==0){
              for(int i=2; i<=n; i+=2){
                  System.out.print(i+" "+(i-1)+" "); 
              }
          }else{
              System.out.println(-1);
          }






    }
}


