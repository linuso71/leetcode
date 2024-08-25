public class maximun_subarray_53 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 5, 6};
        // System.out.println(kandane_algo(arr));
        addon_brute_force(arr);
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
    // add on maximum score from subarray minimuns(1st and 2nd)
    static void addon(int[] arr){
        int maxi = 0;
        int sum = 0;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i] < min1){
                min2 = Math.min(min2,min1);
                min1 = arr[i];
            }
            else {
                min2 = Math.min(min2,arr[i]);
            }
            System.out.println(min1+" "+min2);
            sum = min1 + min2;
            maxi = Math.max(maxi, sum);

        }
        System.out.println(maxi);
    }
    static void addon_brute_force(int[] arr){
        int maxi = 0; 
        for(int i =0;i<arr.length;i++){
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;
            for(int j=i+1;j<arr.length;j++){
                for (int k = i;k<=j;k++){
                    if (arr[k] < min1){
                        min2 = Math.min(min2,min1);
                        min1 = arr[k];
                    }
                    else {
                        min2 = Math.min(min2,arr[k]);
                    }
                }
                
                if ((min1 + min2) > maxi){
                    maxi = min1 + min2;
                }
            }
        }
        System.out.println(maxi);
    }
}
