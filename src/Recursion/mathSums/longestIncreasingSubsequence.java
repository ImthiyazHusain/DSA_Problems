package Recursion.mathSums;

public class longestIncreasingSubsequence {
    static void main() {
        System.out.println(LIS(new int[] {4,10,4,3,8,9,},0,-1));
    }
    public static int LIS(int[] arr,int i,int p_i){
        if(i==arr.length) return 0;
        int len = LIS(arr,i+1,p_i);
        if(p_i == -1 || arr[i]>arr[p_i]){
            len = Math.max(len,1+LIS(arr,i+1,i));
        }
        return len;
    }
}
