package leetcode;

public class missing_number {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int sum = (nums.length*(nums.length+1))/2;
        System.out.println(sum);
        int sum2 = 0;
        for(int i=0;i<nums.length;i++){
            sum2 += nums[i];
        }
    System.out.println(sum2-sum);
    }
    
}
