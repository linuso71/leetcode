import java.util.Arrays;

public class set_matrix_zero_73 {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        optimal_sol(matrix);
        // int[] rows = {0,0,0,0};
        // int[] cols = {0,0,0,0};

        // for (int i=0;i<matrix.length;i++){
        //     for (int j=0;j<matrix[0].length;j++){
        //         if (matrix[i][j]==0){
        //             rows[i] = 1;
        //             cols[j] = 1;
        //         }
        //     }
        // }
        // for (int i=0;i<matrix.length;i++){
        //     for (int j=0;j<matrix[0].length;j++){
        //         if (rows[i]==1 || cols[j]==1){
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }
        System.out.println(Arrays.deepToString(matrix));
    }
    static void optimal_sol(int[][] matrix){
        int col0 = 1;
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if (j != 0) {
                        matrix[0][j] = 0;
                    }
                    else{
                        col0 = 0;
                    }
                }
            }
        }
        for (int i=1;i<matrix.length;i++){
            for (int j=1;j<matrix[0].length;j++){
                if (matrix[i][j] != 0){
                    if (matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        if (matrix[0][0] == 0){
            for(int j=0;j<matrix[0].length;j++){
                matrix[0][j] = 0;
            }
        }
        if (col0 == 0){
            for (int i=0;i<matrix.length;i++){
                matrix[i][0] = 0;
            }
        }
    }
}
