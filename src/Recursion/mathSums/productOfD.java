package Recursion.mathSums;

import java.util.Scanner;

public class productOfD {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(productDigitss(n));
    }
    public static int productDigitss(int n){
        if(n<10 && n>-10){
            return n;
        }
        int t = n%10;
        return productDigitss(n/10)*t;
    }
}
