package Recursion.mathSums;

import java.util.Scanner;

public class sumOfD {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = sumDigit(n);
        System.out.println(n);
    }
    public static int sumDigit(int n){
        if(n==0){
            return 0;
        }
        int t = n%10;
        return sumDigit(n/10)+t;
    }
}
