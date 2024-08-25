import java.util.Arrays;
public class next_permutation_31 {
    public static void main(String[] args) {
        int[] arr= {1,1,5};
        // reverse(arr, 0, arr.length);
        System.out.println(Arrays.toString(optimal_sol(arr)));
    }
    static int[] optimal_sol(int[] arr){
        int index = -1;
        for(int i=arr.length-2;i>=0;i--){
            if (arr[i] < arr[i+1]){
                index = i;
                break;
            }
        }
        // Returning if there is no next permutation greater
        // System.out.println(index);
        if (index == -1){
            return reverse(arr, 0, arr.length);
        }
        // finding smallest but geater than arr[i] to swap
        for(int j = arr.length-1;j>index;j--){
            if (arr[j]>arr[index]){
                int temp = arr[index];
                arr[index] = arr[j];
                arr[j] = temp;
                break;

            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(index+1+" "+ (arr.length-1));
        reverse(arr, index+1, arr.length-1);
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    static int[] reverse(int[] arr,int start,int end){
        // int[] new_arr = new int[arr.length];
        // for (int i=0;i<arr.length;i++){
        //     new_arr[arr.length-i-1] = arr[i];
        // }
        // return new_arr;
        int i =start;
        int j = end;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

}
