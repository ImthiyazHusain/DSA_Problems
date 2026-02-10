package Recursion.mathSums;

import java.util.*;


public class mergeSort {
    static void main(String[] args) {
        int[] arr = {5,5,5,5,4,5};
        int[] newArr = mergeSort(arr);
        System.out.println(Arrays.toString(newArr));
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int s = 0;
        int e = arr.length;
        int mid = s+(e-s)/2;
        int[] a1 = new int[mid];
        int[] a2 = new int[e-mid];
        for(int i=0;i<mid;i++){
            a1[i] = arr[i];
        }
        int j = 0;
        for(int i=mid;i<e;i++){
            a2[j] = arr[i];
            j++;
        }
        return merge(mergeSort(a1),mergeSort(a2));
    }
    public static int[] merge(int[] a1,int[] a2){
        int s1 = 0;
        int s2 = 0;
        int[] res = new int[a1.length+a2.length];
        int i = 0;
        while(s1<a1.length || s2<a2.length){
            if(s1==a1.length){
                while(s2!=a2.length){
                    res[i] = a2[s2];
                    s2++;
                    i++;
                }
                break;
            }
            if(s2==a2.length){
                while(s1!=a1.length){
                    res[i] = a1[s1];
                    s1++;
                    i++;
                }
                break;
            }
            if(a1[s1]<=a2[s2]){
                res[i] = a1[s1];
                s1++;
            }else{
                res[i] = a2[s2];
                s2++;
            }
            i++;
        }
        return res;
    }
}
