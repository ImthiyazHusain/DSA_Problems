package Recursion.mathSums;

import java.util.Scanner;

public class revN {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6678456;
        System.out.println(rev(n));
    }
    public static int rev(int n){
        int digits = (int)Math.log10(n);
        return helper(n,digits);
    }
    public static int helper(int n,int digits){
        if(n==0) return 0;
        return (n%10)*(int)Math.pow(10,digits)+helper(n/10,digits-1);
    }
}
