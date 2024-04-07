import java.util.Arrays;

public class firt_last_binarySearch {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] arr = new int[2];
        int a = lower_bound(nums,target);
        int b = higher_bound(nums,target);
        if (a<b){
            arr[0] = a;
            arr[1] = b; 
        }
        else{
            arr[0] = b;
            arr[1] = a; 
        }
        System.out.println(Arrays.toString(arr));
        // System.out.println(lower_bound(nums,target));
        // System.out.println(higher_bound(nums,target));
    }
    static int lower_bound(int[] nums, int target){
        int low = 0;
        int high = nums.length -1;
        int ans = -1;
        while(low<=high){
            int mid = low + ((high - low)/2);
            if (nums[mid]<= target){
                ans = mid;
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        return ans;
    }
    static int higher_bound(int[] nums, int target){
        int low = 0;
        int high = nums.length -1;
        int ans = nums.length;
        while(low<=high){
            int mid = low + ((high - low)/2);
            if (nums[mid]>= target){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
}
