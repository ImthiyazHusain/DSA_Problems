package Recursion.mathSums;

import java.util.Arrays;
import java.util.Scanner;

public class max_min {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int res[] = MinMax(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] MinMax(int[] arr){
        return helper(arr,0,new int[] {Integer.MAX_VALUE,Integer.MIN_VALUE});
    }
    public static int[] helper(int[] arr,int i,int[] res){
        if(i==arr.length){
            return res;
        }
        if(arr[i]<res[0]) res[0] = arr[i];
        if(arr[i]>res[1]) res[1] = arr[i];
        return helper(arr,i+1,res);
    }
}
