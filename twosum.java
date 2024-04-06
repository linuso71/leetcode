package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(findtarget_twopointer(nums,target)));
        
    }
    static int[] findtarget(int[] nums,int target){
        int i = 0;
        for (int j=1;j<nums.length;j++){
            if(nums[i]+nums[j] == target){
                return new int[]{i,j};
            }
            else{
                i++;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] findtarget_hashmap(int[] nums,int target){
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int[] ans = new int[2]; 
        for (int i=0;i<nums.length;i++){
            int num = nums[i];
            int moreneeded = target - num;
            System.out.println(moreneeded);
            if (mpp.containsKey(moreneeded)){
                System.out.println(moreneeded);
                ans[0] = mpp.get(moreneeded);
                ans[1] = i;
                return ans;
            }
            mpp.put(nums[i],i);
        }
        return new int[]{};
    }
    static int[] findtarget_twopointer(int[] nums,int target){
        sorting(nums);
        System.out.println(Arrays.toString(nums));
        int left = 0;
        int right = nums.length-1;
        System.out.println(right);
        while(left<right){
            int sum = nums[left] + nums[right];
            if (sum == target){
                return new int[] {left,right};
            }
            else if (sum < target){
                left ++;
            }
            else{
                right --;
            }
        }
        return new int[] {-1,-1};
    }
    static void sorting(int[] nums){
        for (int i = 0;i<nums.length;i++){
            for (int j = 1;j<nums.length ;j++){
                if (nums[j-1]>nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
    }
    
}
