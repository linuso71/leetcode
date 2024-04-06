package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class singleNumber {
    public static void main(String[] args) {
        int[] nums = {-1,4,-1,4,5,6,5};
        // single_number(nums);
        System.out.println(single_number_hashmap(nums));
        System.out.println(single_number_xor(nums));
    }
    
    // single_number_hashmap(nums)
    // better method hashing
    // Giving error for -1 numbers 
    static void single_number(int[] nums){
        // find max number in nums
        int maxi = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]>maxi){
                maxi = nums[i];
            }
            
        }
        int[] hash = new int[maxi+1];
        for (int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }
        System.out.println(Arrays.toString(hash));
        for (int i=0;i<nums.length;i++){
            if (hash[nums[i]]==1){
                System.out.println(nums[i]);
            }
        }
    }
    static int single_number_hashmap(int[] nums){
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int value = mpp.getOrDefault(nums[i], 0);
            mpp.put(nums[i],value+1);
        }
        for(Map.Entry<Integer,Integer> it:mpp.entrySet()){
            if (it.getValue() ==1){
                return it.getKey();
            }
        }
        return -1;
    }
    static int single_number_xor(int[] nums){
        int xorr = 0;
        for (int i=0;i<nums.length;i++){
            xorr = xorr ^ nums[i];
        }
        return xorr;
    }

}
