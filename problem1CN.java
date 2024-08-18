// Problem statement
// Given a positive integer ‘N’. Divide numbers from 1 to ‘N’ in two groups such that the absolute difference of sum of each group is minimum and print the absolute difference.

// Example :

// If ‘N’ : 3
// Then the two groups can be : {3} and {2, 1}
// The absolute difference of sum between above two groups is : 0

import java.util.Arrays;

public class problem1CN {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = new int[5];
        int temp = 1;
        for(int i=0;i<n;i++){
            arr[i] += temp;
            temp++;
        }
        // System.out.println(Arrays.toString(arr));
        if(n%2==0){
            for(int i = 1;i<arr.length;i++){
                

        }

    }
}
    
}
