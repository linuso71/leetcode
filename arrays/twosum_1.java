
import java.util.HashMap;

public class twosum_1 {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        // Arrays.sort(arr);
        // int i = 0;
        // int j = arr.length-1;
        // while(i<j){
        //     if (arr[i]+arr[j] == target){
        //         System.out.println(i+" "+j);
        //         break;
        //     }
        //     else if(arr[i]+arr[j]<target){
        //         i++;
        //     }
        //     else{
        //         j--;
        //     }
        // }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            int required = target - arr[i];
            if (map.containsKey(required)){
                System.out.println(map.get(required)+" "+i);
            }
            else{
                map.put(arr[i],i);
            }
        }
    }
}
