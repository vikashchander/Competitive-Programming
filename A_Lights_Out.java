import java.util.*;

public class A_Lights_Out {
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
        Scanner scan = new Scanner(System.in);
        int[][] touched=new int[3][3];
        int[][] arr=new int[3][3];
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                arr[i][j]=1;
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                touched[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(touched[i][j]%2!=0){
                    toggle(arr,i,j);
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }





    }
}