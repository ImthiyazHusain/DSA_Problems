package Recursion.mathSums;

import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,9,7,6,5,4,3,2,1};
        sort(arr);
        for(int n : arr){
            System.out.print(n+" ");
        }
    }
    public static void sort(int[] arr){
        helper(arr,arr.length-1,0);
    }
    public static void helper(int[] arr,int n,int c){
        if(n==0) return;
        if(c<n){
            if (arr[c] > arr[c+1]) {
                int t = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = t;
            }
            helper(arr,n,c+1);
        }else{
            helper(arr,n-1,0);
        }
//        for(int j=1;j<n;j++){
//            if(arr[j]<arr[j-1]){
//                int t = arr[j];
//                arr[j] = arr[j-1];
//                arr[j-1] = t;
//            }
//        }
//        helper(arr,n-1);
    }
}
