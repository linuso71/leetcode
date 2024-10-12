
import java.util.HashMap;

public class longest_subarray_k {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // int sumi=0;
        // int maxLen = 0;
        // for (int i=0;i<arr.length;i++){
        //     sumi += arr[i];
        //     if (sumi == k){
        //         maxLen = Math.max(maxLen, i+1);
        //     }
        //     int rem = sumi - k;
        //     if(map.containsKey(rem)){
        //         int len = i - map.get(rem);
        //         maxLen = Math.max(maxLen, len);
        //     }
        //     if (!map.containsKey(sumi)){
        //         map.put(sumi, i);
        //     }
        // }
        // System.out.println(maxLen);
        System.out.println(optimal_sol(arr, k));
    }
    static int optimal_sol(int[] arr,int k){
        int sum = arr[0];
        int left = 0;
        int right = 0;
        int len = 0;
        while(right<arr.length){
            while(left<=right && sum >k){
                sum -= arr[left];
                left++;
            }
            if (sum ==k){
                len = Math.max(len, right-left+1);
            }
            right++;
            if (right<arr.length){
                sum += arr[right];
            }
        }
        return len;
    }
}
