package Placement;

import java.util.Scanner;

public class ResourcePower {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;
        count += Math.min(a, Math.min(b, c));
        a-=count;
        b-=count;
        c-=count;

        count += a/3;
        count += b/3;
        count += c/3;

//        while(a!=0 && b!=0 && c!=0){
//            a--;
//            b--;
//            c--;
//            count++;
//        }

        System.out.println(count);
    }
}
