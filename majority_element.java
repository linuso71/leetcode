public class majority_element {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int count = 0;
        int max = 0;
        int i = 0;
        for (int j=0;j<nums.length-1;j++){
            if (nums[j]==i){
                count +=1;
                if (max< count){
                    max = count;
                }
            }
            else{
                count = 0;
                i = j;
            }
        }
    }
}
