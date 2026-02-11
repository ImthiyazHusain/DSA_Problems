package BinarySearch;

import java.util.Scanner;

public class rotatedBS {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = {6,7,8,9,1,2,3};
        int peek = peek(arr);
        int index = search(arr,0,peek,t);
        if(index == -1){
            System.out.println(search(arr,peek+1,arr.length-1,t));
        } else {
            System.out.println(index);
        }
    }
    public static int peek(int[] nums){
        int s = 0;
        int e = nums.length-1;
        int mid = 0;
        while(s<=e){
            mid = s+(e-s)/2;
            if(mid<e && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>0 && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]<=nums[s]){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
    public static int search(int[] arr,int s,int e,int t){
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==t){
                return mid;
            }
            if(t>arr[mid]){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return -1;
    }
}
