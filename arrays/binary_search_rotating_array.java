public class  binary_search_rotating_array{
    public static void main(String[] args) {
        int[] nums = {1,3};
        int target = 3;
        System.out.println(search(nums,target));
    }
        
    public static int search(int[] nums,int target){
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low + high) / 2;
            System.out.println(mid);
            if (nums[mid] == target){
                return mid;
            }
            if (nums[low]<= nums[mid]){
                if (nums[low]<= target && target <= nums[high]){
                    high = mid-1;
                }
                else{
                    low = mid + 1;

                }
            }
            else{
                if (nums[low]<= target && target <= nums[high]){
                    low = mid + 1;
                }
                else{
                    high = mid-1;
                }

            }
        }
        return -1;
    }

        
}
