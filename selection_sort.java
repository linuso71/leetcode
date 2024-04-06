package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int arr[] = {2,13,4,1,3,6,28};
        for (int i=0;i<arr.length;i++){
            int last = arr.length-1-i;
            int max = 0;
            for (int j=0;j<last;j++){
                if (arr[j] > arr[max]){
                    max = j;
                }
            }
            int temp = arr[last];
            arr[last] = arr[max];
            arr[max] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
