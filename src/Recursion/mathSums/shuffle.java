package Recursion.mathSums;
/*
*
* Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
* Return the array in the form [x1,y1,x2,y2,...,xn,yn].
* array size should be even
*
*/
import java.util.Scanner;

public class shuffle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //array size
        int n = sc.nextInt();
        //edge case
        if(n%2!=0){
            System.out.println("Invalid array size!!!");
            return;
        }
        //getArray
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        //shuffle use recursion
        shuffle(nums,n/20,0,0,0);

        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }

    }
    public static void shuffle(int[] nums,int n,int flg,int i,int ni){
        int val = nums[i];
        if(ni==n*2-1){
            nums[ni] = val;
            return;
        }
        if(flg==0){
            shuffle(nums,n,1,i+n,ni+1);
            nums[ni] = val;
            return;
        }else{
            shuffle(nums,n,0,i-n+1,ni+1);
            nums[ni] = val;
            return;
        }
    }
}
