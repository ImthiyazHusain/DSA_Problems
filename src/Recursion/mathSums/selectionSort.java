package Recursion.mathSums;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {9,8,7,6,5,4,3,2,1};
        selectionSort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr,int r,int c,int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                selectionSort(arr,r,c+1,c);
            }else{
                selectionSort(arr,r,c+1,max);
            }
        }else{
            int t = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = t;
            selectionSort(arr,r-1,0,0);
        }
    }
}
