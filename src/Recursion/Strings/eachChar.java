package Recursion.Strings;

import java.util.Scanner;

public class eachChar {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        print(s);
    }
    public static void print(String s){
        Helper(s,0);
    }
    public static void Helper(String s,int i){

        System.out.println(s.charAt(i));
        if(i==s.length()-1){
            return;
        }
        Helper(s,i+1);
    }
}
