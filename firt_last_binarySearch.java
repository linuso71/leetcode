import java.util.Arrays;

public class firt_last_binarySearch {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        System.out.println(Arrays.toString(first_last_algo(nums,target)));
    }
    static int[] first_last_algo(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;
        if (nums.length == 0){
            return new int[] {-1,-1};
        }
        if (nums.length == 1){
            if (target == nums[0]){
                return new int[] {-1,-1};
            }
        }
        while(start <= end){
            int mid = start + ((end - start)/2);
            if (target == nums[mid]){
                if (nums[mid-1] == target){
                    return new int[] {mid-1,mid};
                }
                if (nums[mid+1] == target){
                    return new int[] {mid,mid+1};
                }
            }
            else if( target > nums[mid]){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return new int[] {-1,-1};
    }
    static int[] first_last_tuf(int[] v, int key){
        int n = v.length;
        int start = 0;
        int end = n - 1;
        int[] res = {};

        while (start <= end) {
        int mid = start + (end - start) / 2;
        if (v[mid] == key) {
                if (start == 0){
                    
                }

        } else if (key < v[mid]) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
        }
        return int[] res;
    }
}
