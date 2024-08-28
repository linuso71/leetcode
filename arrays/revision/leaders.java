import java.util.*;
public class leaders {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        ArrayList<Integer> leaders = new ArrayList<Integer>();
        leaders.add(arr[arr.length-1]); 
        int maxi = 0;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>maxi){
                leaders.add(arr[i]);
                maxi = Math.max(maxi,arr[i]);
            }
        }
        System.out.println(leaders);
    }
}
