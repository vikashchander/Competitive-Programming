import java.io.*;
import java.util.*;

class worthy {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            int k = sc.nextInt();
            int mat[][] = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }
            binearySearch(mat, row, col, k, counter);
        }

    }

    public static void binarySearch(int[][] mat, int row, int col, int k, int counter) {
        int low = 0;
        int high = row - 1;
        while (low <= high) {
               int mid=low+high/2;
               if(mat[low][mid]>=k){

               }else if(){

               }
        }
    }
}
