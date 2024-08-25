import java.util.ArrayList;
import java.util.*;
public class rearrange_by_sign_2149 {
    public static void main(String[] args) {
        int[] arr  = {3,1,-2,-5,2,-4};
        // ArrayList<Integer> arr_p = new ArrayList<Integer>();
        // ArrayList<Integer> arr_n = new ArrayList<Integer>();
        // for(int i=0;i<arr.length;i++){
        //     if (arr[i]>=0){
        //         arr_p.add(arr[i]);
        //     }
        //     else{
        //         arr_n.add(arr[i]);
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        //     if (i%2==0){
        //         arr[i] = arr_p.removeFirst(); 
        //     }
        //     else{
        //         arr[i] = arr_n.removeFirst();            
        //     }
            
        // }
        // System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(optimal_sol(arr)));
    }
    static int[] optimal_sol(int[] arr){
        int pos = 0;
        int neg = 1;
        int[] new_arr = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>0){
                new_arr[pos] = arr[i];
                pos += 2;
            }
            else{
                new_arr[neg] = arr[i];
                neg += 2;
            }
            
        }
        return new_arr;

    }
}
