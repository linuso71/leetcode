package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


public class dupliactes {
public static void main(String[] args) {
    int[] arr = {-3,-1,0,0,0,3,3};
    // Set<Integer> set = new HashSet<>();
    // for (int i= 0;i<arr.length;i++){
    //     set.add(arr[i]);
    //     System.out.print(arr[i]+" ");
    // }
    // System.out.println(set+"settttttt");
    // Iterator it = set.iterator();
    // int index = 0;
    // while(it.hasNext()){
    //     Object element = it.next();
    //     arr[index] = Integer.parseInt(element.toString());
    //     System.out.println(Arrays.toString(arr));
    //     index++;
        
    // }
    // System.out.println(Arrays.toString(arr));
    // System.out.println(index);
    remove_duplicates(arr);
    }
    static void remove_duplicates(int[] arr){
        int counter = 0;
        for (int j=1;j<arr.length;j++){
            if (arr[counter] != arr[j]){
                arr[counter+1] = arr[j];
                counter ++;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

