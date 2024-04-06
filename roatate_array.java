package leetcode;

import java.util.Arrays;

// 189 leetcode
public class roatate_array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k =3;
        
        // for (int j = 0;j<k;j++){
        //     int last = nums[nums.length-1];
        //     for (int i=nums.length-1;i>0;i--){
        //         nums[i] = nums[i-1];
    
        //         // System.out.println(i);
        //     }
        //     System.out.println(Arrays.toString(nums));
        //     nums[0] = last;
        //     System.out.println(Arrays.toString(nums));
        // }
        // right_rotate(k,nums);
        // reverse(0,k-1,nums);
        // reverse(k, nums.length-1, nums);
        // reverse(0, nums.length-1, nums);
        // System.out.println(Arrays.toString(nums));
        // k = k% nums.length;
        rotate_left(nums,k);
        
        System.out.println(Arrays.toString(nums));
        
    }
    // static void right_rotate(int k,int[] nums){
    //     reverse(0,k,nums);
    //     reverse(k+1, nums.length, nums);
    //     System.out.println(nums);
    // }
    static void reverse(int start,int end,int[] nums){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;

        }
    }
    static void rotate_left(int[] nums,int d){
        int[] temp= new int[d];
        for (int i=0;i<d;i++){
            temp[i]=nums[i];
        }
        for (int i=nums.length-d-1;i<nums.length;i++){
            nums[i-d] = nums[i];
        }
        for (int i=nums.length-d;i<nums.length;i++){
            nums[i] = temp[i-(nums.length-d)];
        }
    }
}
