package Recursion.mathSums;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Sumtrianglefromarray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.println(triangleSum(arr));
    }
    public static int triangleSum(int[] arr){
        if(arr.length==1){
            return arr[0];
        }
        int[] temp = new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            temp[i] = arr[i]+arr[i+1];
        }
        System.out.println(Arrays.toString(temp));
        return triangleSum(temp);
    }
}
