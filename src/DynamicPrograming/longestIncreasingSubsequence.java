package DynamicPrograming;

import java.util.*;

public class longestIncreasingSubsequence {
    static void main() {
        int[] arr = {10,9,2,5,3,7,101,18};
        int[] dp = new int[arr.length];
        Arrays.fill(dp,1);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int max = 0;
        for(int i : dp){
            max = Math.max(max,i);
        }
        System.out.println(max);
    }
}
