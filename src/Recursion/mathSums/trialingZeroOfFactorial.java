package Recursion.mathSums;

import java.util.Scanner;

public class trialingZeroOfFactorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
    public static int fact(int n){
        if(n==0) return 0;
        if(n<5) return 0;
        return helper(n,5,0);
    }
    public static int helper(int n,int m,int sum){
        sum = n/m;
        if(n/m==0) return sum;
        return sum+helper(n,m*5,sum);
    }
}
