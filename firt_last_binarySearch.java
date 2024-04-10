import java.util.Arrays;

public class firt_last_binarySearch {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,2,2,2,2};
        int target = 2;
        int[] arr = new int[2];
        int a = lower_bound(nums,target);
        if (a == -1 || nums[a] != target){
            System.out.println(Arrays.toString(new int[]{-1,-1}));
        }
        int b = higher_bound(nums,target);
        // int first = first_occurence_binarySearch(nums, target);
        // if (first == -1){
        //     System.out.println(-1);
        // }
        // int last  = last_occurence_binarySearch(nums, target);
        // System.out.println(first+""+last);
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
    static int higher_bound(int[] nums, int target){
        int low = 0;
        int high = nums.length -1;
        int ans = -1;
        while(low<=high){
            int mid = low + ((high - low)/2);
            if (nums[mid]> target){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }

    static int first_occurence_binarySearch(int[] nums,int target){
        int low = 0;
        int high = nums.length -1;
        int first = -1;
        while(low<= high){
            int mid = low + ((high - low)/2);
            if (nums[mid] == target){
                first = mid;
                high = mid -1;
            }
            else if (nums[mid] > target){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return first;
    }
    static int last_occurence_binarySearch(int[] nums,int target){
        int low = 0;
        int high = nums.length -1;
        int last = -1;
        while(low<= high){
            int mid = low + ((high - low)/2);
            if (nums[mid] == target){
                last = mid;
                low = mid +1;
            }
            else if (nums[mid] > target){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return last;
    }
}
