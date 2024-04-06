package leetcode;

public class findMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int count =0;
        int maxi= 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i] != 0){
                count+=1;
                if (count > maxi){
                    maxi = count;
                }
            }
            else{
                count = 0;
            }
        }
        System.out.println(maxi);
    }
}
