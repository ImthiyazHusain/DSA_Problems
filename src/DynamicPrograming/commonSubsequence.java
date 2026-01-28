package DynamicPrograming;

import java.util.*;

public class commonSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "Husain";
        String s2 = "husain";

        String dp[][] = new String[s2.length()+1][s1.length()+1];
        for(String[] arr : dp){
            Arrays.fill(arr,"");
        }
        for(int i=1;i<=s2.length();i++){
            for(int j=1;j<=s1.length();j++){
                if(s2.charAt(i-1)==s1.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+s1.charAt(i-1);
                }else{
                    dp[i][j] = (dp[i-1][j].length()<=dp[i][j-1].length()?dp[i][j-1]:dp[i-1][j]);
                }
            }
        }
//        for(String[] arr : dp){
//            for(String s : arr){
//                System.out.print(s+" ");
//            }
//            System.out.println();
//        }
         System.out.print(dp[dp.length-1][dp[0].length-1]);
    }
}