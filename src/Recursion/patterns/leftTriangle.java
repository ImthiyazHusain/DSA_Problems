package Recursion.patterns;

import java.util.Scanner;

public class leftTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTriangle(n,0);
        printTriangle2(n,0);
    }
    public static void printTriangle(int r,int c){

        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("* ");
            printTriangle(r,c+1);
        }
        else {
            System.out.println();
            printTriangle(r - 1, 0);

        }
    }

    public static void printTriangle2(int r,int c){

        if(r==0){
            return;
        }
        if(c<r){
            printTriangle2(r,c+1);
            System.out.print("* ");
        }
        else {
            printTriangle2(r - 1, 0);
            System.out.println();
        }
    }
}
