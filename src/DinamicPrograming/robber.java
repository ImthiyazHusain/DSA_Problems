package DinamicPrograming;

import java.util.Arrays;

public class robber {
    static void main(String[] args) {
        int[] arr = {20,10,40,12};
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(dp[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            dp[i] = Math.max(dp[i-1],arr[i]+dp[i-2]);
        }
        System.out.println(dp[arr.length-1]+" "+ Arrays.toString(dp));
    }
}
