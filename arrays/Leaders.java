// import java.lang.reflect.Array;
import java.util.ArrayList;

public class Leaders {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        int maxi = 0;

        ArrayList<Integer> leader = new ArrayList<>();
        for (int i = arr.length-1;i>-1;i--){
            // System.out.println("something");
            // System.out.println(arr[i]);
            if (arr[i] > maxi) {
                // System.out.println(arr[i]);
                maxi = arr[i];
                leader.add(arr[i]);
            }
        }
        System.out.println(leader);
        ArrayList<Integer> revLeader = new ArrayList<>();
        for(int i=leader.size()-1;i>-1;i--){
            revLeader.add(leader.get(i));
            System.out.println(revLeader);
        }
        
    }
}
