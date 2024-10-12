public class subarray_sum_560 {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int k=2;
        int out = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;  // Initialize sum to 0 at the start of each subarray
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];  // Add current element to sum
                if (sum == k) {
                    out++;  // If the sum equals k, count this subarray
                }
            }
        }
        System.out.println(out);
    }
}
