package Recursion.mathSums;

import java.util.Scanner;

public class binarySearch {
    static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int arr[]  = {1,2,3,4,5,6,7,8,9,10};
        int t = sc.nextInt();
        System.out.println(search(arr,t));
    }
    public static int search(int[] arr,int t){
        return BS(arr,t,0,arr.length-1);
    }
    public static int BS(int[] arr,int t,int s,int e){
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid] == t){
            return mid;
        }
        if(t<arr[mid]) return BS(arr,t,s,mid-1);
        return BS(arr,t,mid+1,e);
    }
}
