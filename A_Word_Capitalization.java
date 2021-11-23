import java.util.*;

public class A_Word_Capitalization {
    static void change(int[][] arr, int i, int j){
        if(arr[i][j]==1)
            arr[i][j]--;
        else
            arr[i][j]++;
    }
    static void toggle(int[][] arr, int i, int j){
        change(arr,i,j);
        if(i-1>=0){
            change(arr,i-1,j);
        }
        if(i+1<=2){
            change(arr,i+1,j);
        }
        if(j-1>=0){
            change(arr,i,j-1);
        }
        if(j+1<=2){
            change(arr,i,j+1);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         String str = scn.nextLine();
         char[] ch = str.toCharArray();
         StringBuilder sb = new StringBuilder();
         
          if(Character.isLowerCase(ch[0])){
               ch[0] = Character.toUpperCase(ch[0]);
               for(char c: ch){
                   sb.append(c);
               }
               System.out.println(sb.toString());
          }else{
              System.out.println(str);
          }





    }
}