package Recursion.mathSums;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class returnList {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,5,4,67};
        int t = 4;
        System.out.println(findAll(arr,t));
    }
    public static ArrayList<Integer> findAll(int[] arr,int t){
        return helper(arr,t,0);
    }
    private static ArrayList<Integer> helper(int[] arr, int t, int i) {
        if(i>=arr.length){
            return new ArrayList<>();
        }
        ArrayList<Integer> list = new ArrayList<>();
        if(arr[i]==t){
            list.add(i);
        }
        list.addAll(helper(arr,t,i+1));
        return list;
    }

}
