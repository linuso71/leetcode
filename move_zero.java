package leetcode;

import java.util.Arrays;

public class move_zero {
    public static void main(String[] args) {
        int[] nums = {4,1,0,3,12};
        moveZeroOptimal(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void moveZero(int[] nums){
        int[] temp = new int[nums.length];
        int j = 0;
        for (int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                temp[j] = nums[i];
                j++;
            }
        }

        for (int i = 0 ;i<temp.length;i++){
            nums[i] = temp[i];
        }
        for (int i = j+1;i<nums.length;i++){
            nums[i] = 0;
        }
    }
    static void moveZeroOptimal(int[] nums){
        // finding first 0 element
        int j = -1;
        for (int i=0;i<nums.length;i++){
            if (nums[i] == 0){
                j = i;
                break;
            }
        }
        // searching from 0 and swaping with non zero
        for (int i = j+1;i<nums.length;i++){
            if (nums[i] != 0){
                swap(nums,i,j);
                j++;
            }
        }
    }
    static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
