package Recursion.mathSums;


public class linearSearch {
    static void main(String[] args) {
        int[] arr = {3,1,2,18,9};
        int t = 1;
        System.out.println("found at index (-1 for no existence) : "+Search(arr,t));
    }
    public static int Search(int[] arr,int t){
        return helper(arr,t,0);
    }
    public static int helper(int[] arr,int t,int i){
        if(i>=arr.length){
            return -1;
        }
        if(arr[i]==t)return i;
        return helper(arr,t,i+1);
    }
}
