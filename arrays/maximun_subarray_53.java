public class maximun_subarray_53 {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(kandane_algo(arr));
    }
    static int brute_force(int[] arr){
        int maxi = 0;
        for(int i=0;i<arr.length;i++){
            
            for(int j=i;j<arr.length;j++){
                int sum =0;
                for (int k = i;k<=j;k++){
                    sum += arr[k];
                }
                maxi = Math.max(sum, maxi);
            }
            
        }
        return maxi;
    }
    static int better_sol(int[] arr){
        int maxi = 0;
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for (int j=i;j<arr.length;j++){
                sum += arr[j];
                maxi = Math.max(sum, maxi);
            }
        }
        return maxi;
    }
    static int kandane_algo(int[] arr){
        int sum = 0;
        int maxi = 0;
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
            maxi = Math.max(maxi, sum);
            if (sum<0){
                sum = 0;
            }
        }
        return maxi;
    }
}
