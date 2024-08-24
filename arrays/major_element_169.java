import java.util.HashMap;

public class major_element_169 {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        // sort_sol(arr, 0, arr.length-1);
        System.out.println(moore_voting_algo(arr));
        // System.out.println(arr[arr.length/2]);
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<arr.length;i++){
        //     map.merge(arr[i],1,Integer::sum);
        // }
        // for (int i=0;i<arr.length;i++){
        //     if (map.get(arr[i])>arr.length/2){
        //         System.out.println(arr[i]);
        //         break;
        //     }
        // }
        // System.out.println(map.size());
    }
    static void sort_sol(int[] arr,int low,int high){
        if (low<high){
            int p = pivot(arr,low,high);
            sort_sol(arr, low, p-1);
            sort_sol(arr, p+1, high);
        }
    }
    static int pivot(int[] arr,int low,int high){
        int p = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i]<=p && i<=high-1){
                i++;
            }
            while(arr[j]>p && i>=low+1){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;
        return j;

    }
    static int moore_voting_algo(int[] arr){
        int ele =0;
        int count = 0;
        for (int i=0;i<arr.length;i++){
            if (count==0){
                ele = arr[i];
                count = 1;
            }
            else if (arr[i] == ele){
                count ++;
            }
            else{
                count --;
            }
        }
        int cnt = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i] == ele){
                cnt++;
            }

        }
        if (cnt > arr.length/2){
            return ele;
        }
        return -1;
    }
}
