package Recursion.mathSums;

import java.util.Arrays;


public class mergeSortInplace {
    static void main(String[] args) {
        int[] arr = {9,8,1,500,6,5,4,3,3,2,1,7,8,9,0,334};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Sort(int[] arr){
        mergeSort(arr,0,arr.length-1);
    }
    public static void mergeSort(int[] arr,int s,int e){
        if(s==e){
            return;
        }
        int mid = s+(e-s)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);
        merge(arr,s,mid,mid+1,e);
    }
    public static void merge(int[] a1,int s,int mid,int s2,int e){
        while(s<=mid && s2<=e){
            if(a1[s]>a1[s2]){
                int val = a1[s2];
                insert(val,s,s2,a1);
                s2++;
                mid++;
            }
            s++;
        }
    }
    public static void insert(int val,int pos,int endpos,int[] arr){

        while(endpos>pos){
            arr[endpos] = arr[endpos-1];
            endpos--;
        }
        arr[pos] = val;
    }

}
