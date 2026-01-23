package Recursion.mathSums;

import java.util.Scanner;

public class powOfTwo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n) {
        double m = (double)n;
        if(n==1) return true;
        return helper(m);
    }
    public static boolean helper(double m){
        if(m==2.0) return true;
        if(m<2.0) return false;
        return helper(m/2);
    }
}
