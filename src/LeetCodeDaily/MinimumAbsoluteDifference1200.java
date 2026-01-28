package LeetCodeDaily;

import java.util.*;
public class MinimumAbsoluteDifference1200
{
	public static void main(String[] args) {
		int[] arr = {3,4,2,5,6,7,9,32,100};
		List<List<Integer>> list = minimumAbsDifference(arr);
		System.out.print(list);
	}
	public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            min = Math.min(min,arr[i+1]-arr[i]);
        }
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==min){
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                list.add(temp);
            }
        }
        return list;
    }
}
