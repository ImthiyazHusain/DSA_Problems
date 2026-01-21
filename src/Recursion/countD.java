package Placement.recursion;

import java.util.Scanner;

public class countD {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countD(n));
    }
    public static int countD(int n){
        if(n==0){
            return 0;
        }
        return countD(n/10)+1;
    }
}
