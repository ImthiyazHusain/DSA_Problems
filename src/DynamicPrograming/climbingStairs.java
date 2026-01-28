package DynamicPrograming;

import java.util.Arrays;
import java.util.Scanner;

public class climbingStairs {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int steps = sc.nextInt();
        int[] dp = new int[steps+2];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<dp.length;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        System.out.println(dp[steps+1]+" "+ Arrays.toString(dp));
    }
}
