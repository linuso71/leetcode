import java.util.Arrays;

public class rotate_matrix_48 {
    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        // int[][] new_matrix = new int[matrix.length][matrix.length];
        // for(int i=0;i<matrix.length;i++){
        //     for (int j=0;j<matrix[0].length;j++){
        //         new_matrix[j][matrix.length-i-1] = matrix[i][j];
        //     }
     
        // }
        optimal_sol(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    static void optimal_sol(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (i>j){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                    // System.out.println(Arrays.deepToString(arr));
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length/2;j++){
            int temp = arr[i][j];
            arr[i][j] = arr[i][arr.length-1-j]; 
            arr[i][arr.length-1-j] = temp;
            System.out.println(Arrays.deepToString(arr));
        }
        }
    }
}
// Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]