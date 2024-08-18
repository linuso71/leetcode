import java.util.ArrayList;
import java.util.List;

public class union {
    public static void main(String[] args) {
    int n = 10, m = 7;
    int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int arr2[] = {2, 3, 4, 4, 5, 11, 12};
    find_union(arr1,arr2,n,m);
    // HashMap <Integer,Integer > freq=new HashMap<>();
    // ArrayList<Integer> Union=new ArrayList<>();
    // for (int i = 0; i < n; i++){
    //     freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
    // }
    // System.out.println(freq);
    
    // for (int j = 0; j < m; j++){
    //     freq.put(arr2[j],freq.getOrDefault(arr2[j],0)+1);
    // }
    // System.out.println(freq);
    // for (int it: freq.keySet()){
    //     Union.add(it);
    // }
    // System.out.println(Union);
        
    }
    static void find_union(int[] arr1,int[] arr2, int n, int m){
        List<Integer> output = new ArrayList<>();
        int i=0;
        int j = 0;
        while(i<n && j<m){
            if (arr1[i]<=arr2[j]){
                if(output.size() == 0 || output.getLast() != arr1[i]){
                    output.add(arr1[i]);
                }
                i++;
            }
            else{
                if(output.size() == 0 || output.getLast() != arr2[j]){
                    output.add(arr2[j]);
                }
                j++;
            }

        }
        while(i<n){
            if(output.size() == 0 || output.getLast() != arr1[i]){
                    output.add(arr1[i]);
                }
                i++;
            }
        while(j<m){
            if(output.size() == 0 || output.getLast() != arr2[j]){
                output.add(arr2[j]);
            }
            j++;
        }
        System.out.println(output);

    }
}
    
