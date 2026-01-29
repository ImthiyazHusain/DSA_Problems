package Recursion.mathSums;

import java.util.Scanner;

public class arraySorted {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,6,7,8,8};
        System.out.println(isSorted(arr));
    }
    public static boolean isSorted(int[] arr){
        return helper(arr,0);
    }
    public static boolean helper(int[] arr,int i){
        if(i>=arr.length-1){
            return true;
        }
        return arr[i]<=arr[i+1]&&helper(arr,i+1);
    }
}
