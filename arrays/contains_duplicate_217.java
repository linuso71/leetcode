import java.util.HashSet;

public class contains_duplicate_217 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0;i<arr.length;i++){
            if (!set.add(arr[i])){
                System.out.println("true");
            }
        }
        

    }
}
