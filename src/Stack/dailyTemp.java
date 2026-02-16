package Stack;

import java.util.Arrays;
import java.util.Stack;


public class dailyTemp {
    static void main(String[] args) {
        System.out.print(Arrays.toString(NGE(new int[] {73,74,72,75,73,69,81})));
    }
    public static int[] NGE(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && nums[i]>nums[stack.peek()]){
                int t = stack.pop();
                ans[t] = i - t;
            }
//            if(stack.isEmpty()){
//                ans[i] = -1;
//            }
            stack.push(i);
        }
        return ans;
    }
}
