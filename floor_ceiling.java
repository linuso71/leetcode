import java.util.Arrays;

public class floor_ceiling {
    public static void main(String[] args) {
        int[] nums = {3, 4, 7, 8, 8, 10};
        int target = 5;
        // System.out.println(floor(nums, target));
        // System.out.println(ceil(nums,target));
        int[] ans = new int[2];
        ans[0] = floor(nums, target);
        ans[1] = ceil(nums,target);
        System.out.println(Arrays.toString(ans));


        
    }
    static int floor(int[] nums,int target){
        int start = 0 ;
        int end = nums.length-1;
        int ans=nums.length-1;
        while (start<=end){
            int mid = start + ((end - start)/2);
            // floor
            if (nums[mid] <= target){
                ans = mid;
                System.out.println(ans+" ans");
                start = mid +1;
                
            }
            else{
                // celing
                end = mid -1;
            }
        }
        // ans[1] = ans[0] +1;
        return nums[ans];
    }
    static int ceil(int[] nums, int target){
        int start = 0 ;
        int end = nums.length-1;
        int ans=nums.length-1;
        while (start<=end){
            int mid = start + ((end - start)/2);
            // floor
            if (nums[mid] >= target){
                ans = mid;
                System.out.println(ans+" ans");
                end = mid -1;
                
            }
            else{
                // celing
                start = mid +1;
            }
        }
        // ans[1] = ans[0] +1;
        return nums[ans];
    }
}
