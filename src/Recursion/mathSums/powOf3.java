package Recursion.mathSums;

import java.util.Scanner;

public class powOf3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPowerOfThree(n));
    }
    public static boolean isPowerOfThree(int n) {
        if(n==1) return true;

        return helper((double)n);

    }
    public static boolean helper(double n){
        if(n==3.0){
            return true;
        }
        if(n<3){
            return false;
        }
        return helper(n/3);
    }
}
