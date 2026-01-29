package Recursion.mathSums;

import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {9,7,6,5,4,3,2,1};
        sort(arr);
        for(int n : arr){
            System.out.println(n+" ");
        }
    }
    public static void sort(int[] arr){
        helper(arr,arr.length);
    }
    public static void helper(int[] arr,int n){
        if(n<=1) return;
        for(int j=1;j<n;j++){
            if(arr[j]<arr[j-1]){
                int t = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = t;
            }
        }
        helper(arr,n-1);
    }
}
