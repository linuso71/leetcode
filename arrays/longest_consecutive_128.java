import java.util.ArrayList;
import java.util.Arrays;
public class longest_consecutive_128 {
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        merge_sort(arr, 0, arr.length-1);
        int longest = 1;
        int last = Integer.MAX_VALUE;
        int count = 0;
        for (int i=0;i<arr.length;i++){
            if(arr[i] -1 == last){
                count +=1;
                last = arr[i];
            }
            else if(arr[i] != last){
                count = 1;
                last = arr[i];
            }
            longest = Math.max(longest, count);
        }
        System.out.println(longest);
    } 
    static void merge_sort(int[] arr,int low,int high){
        if (low>= high){
            return;
        }
        int mid = (low + high) / 2;
        merge_sort(arr, low, mid);
        merge_sort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
    static void merge(int[] arr,int low,int mid,int high){
        int left = low;
        int right = mid+1;
        ArrayList<Integer> new_arr = new ArrayList<>();
        while(left<=mid && right<=high){
            if (arr[left]<=arr[right]){
                new_arr.add(arr[left]);
                left++;
            }
            else{
                new_arr.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            new_arr.add(arr[left]);
            left++;
        }  
        while(right<=high){
            new_arr.add(arr[right]);
            right ++;
        }
        
        for (int i =low;i<=high;i++){
            arr[i] = new_arr.get(i-low);
        }

    }
}
