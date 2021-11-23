//package cchef;

import java.util.*;

public class A_Arrival_of_the_General {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          int min = Integer.MAX_VALUE;
          int max = Integer.MIN_VALUE;
          int posMin = -1;
          int posMax = -1;

          for(int i=0; i<n; i++){
             int val = scn.nextInt(); 
             if(min>=val){
                  posMin = i;
                  min = val;
              }
              if(max<val){
                  posMax = i;
                  max = val;
              }
          }
          
         if(posMin>posMax){
          int res = Math.abs((n-1)-posMin);
          System.out.println((res+posMax));
         }else{
             int res = Math.abs((n-1)-posMin);
            //  System.out.println(posMin);
           System.out.println((res+posMax)-1);
         }
    }
}


