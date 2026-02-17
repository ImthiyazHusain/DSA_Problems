package BinarySearch;

import java.util.*;

public class longestIncreasingSubsequence {
    static void main() {
        int[] arr = {4,10,4,3,8,9};
        List<Integer> len = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            if(len.size()==0 || arr[i]>len.get(len.size()-1)){
                len.add(arr[i]);
            }
            else{
                int pos = findNextPos(len,arr[i]);
                len.set(pos,arr[i]);
            }
        }
        System.out.println(len);
    }
    public static int findNextPos(List<Integer> list,int t){
        int s = 0;
        int e = list.size()-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(t>list.get(mid)){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return s;
    }
}
