import java.util.Arrays;

public class sort_colors_75 {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        // dutch_national_flag(arr);
        // better_sol(arr);
        int low = 0;
        int high = arr.length-1;
        sorting_merge(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }
    static void dutch_national_flag(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid<=high){
            if (arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid ++;
                low ++;
            }
            else if(arr[mid] == 1){
                mid ++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high --;
            }
        }
    }
    static void better_sol(int[] arr){
        int count_0 =0;
        int count_1 =0;
        int count_2= 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] == 0){
                count_0++;
            }
            else if(arr[i] == 1){
                count_1++; 
            }
            else{
                count_2++;
            }   
        }
        for(int j=0;j<count_0;j++){
            arr[j] = 0; 
        }
        for(int j=count_0;j<count_0+count_1;j++){
            arr[j] = 1; 
        }
        for(int j=count_0+count_1;j<count_0+count_1+count_2;j++){
            arr[j] = 2; 
        }
        
        // System.out.println(Arrays.toString(arr));
    }
    static void sorting_merge(int[] arr,int low,int high){
        if (low<high){
            int p = pivot(arr,low,high);
            sorting_merge(arr,low,p-1);
            sorting_merge(arr, p+1, high);
        }
    }
    static int pivot(int[] arr,int low,int high){
        int p = arr[low];
        int i= low;
        int j = high;
        while(i<j){
            while(arr[i]<=p && i<=high-1){
                i++;
            }
            while(arr[j]>p && i>=low+1){
                j--;
            }
            if(i<j){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
}
