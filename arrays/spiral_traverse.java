import java.util.ArrayList;
import java.util.List;
public class spiral_traverse {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        List<Integer> new_arr = new ArrayList<>();
        while(top<=bottom && left<=right){
            // left to right
            for (int i=left;i<=right;i++){
                new_arr.add(matrix[top][i]);
            }
            top++;
            // top to bottom
            for (int i=top;i<=bottom;i++){
                new_arr.add(matrix[i][bottom]);
            }
            right--;
            // bottom to top
            if (top<=bottom){
                for (int i=right;i>=left;i--){
                    new_arr.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if (left<=right){
                for (int i=bottom;i>=top;i--){
                    new_arr.add(matrix[i][left]);
                }
                left++;
            }
        }
        System.out.println(new_arr);
    }
    
}
