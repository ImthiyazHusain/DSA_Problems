package Recursion.mathSums;

import java.util.Scanner;

public class power {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(pow(a,b));
    }
    public static int pow(int a,int b){
        if(b==1){
            return a;
        }
        return a*pow(a,b-1);
    }
}
