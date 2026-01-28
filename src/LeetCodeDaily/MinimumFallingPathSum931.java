package LeetCodeDaily;

import java.util.Scanner;

public class MinimumFallingPathSum931 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {
                {  1,  100,  100,  100,   2 },
                {  50,  1000, 1000, 1000,  50 },
                {  50,  1000, 1000, 1000,  50 },
                {  50,  1000, 1000, 1000,  50 },
                {   1,   100,  100,  100,   1 }
        };
        System.out.println(minFallingPathSum(matrix));
    }

    public static int minFallingPathSum(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int t = Integer.MAX_VALUE;
                if(j-1>=0 && i-1>=0){
                    t = matrix[i][j]+matrix[i-1][j-1];
                }
                if(i-1>=0){
                    if(t==Integer.MAX_VALUE){
                        t = matrix[i][j]+matrix[i-1][j];
                    } else t = Math.min(t,matrix[i][j]+matrix[i-1][j]);
                }
                if(j+1<matrix[0].length && i-1>=0){
                    if(t==Integer.MAX_VALUE){
                        t = matrix[i][j]+matrix[i-1][j+1];
                    } else t = Math.min(t,matrix[i][j]+matrix[i-1][j+1]);
                }
                if(t!=Integer.MAX_VALUE){
                    matrix[i][j] = t;
                }

            }
        }
        for(int i=0;i<matrix[matrix.length-1].length;i++){
            min = Math.min(min,matrix[matrix.length-1][i]);
        }
        return min;
    }
}
