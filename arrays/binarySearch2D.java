public class binarySearch2D {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 20;
        System.out.println(arr[0].length);
        System.out.println(arr.length);
        System.out.println(searchMatrix(arr,target));
        
    }
        static boolean searchMatrix(int[][] matrix, int target) {
            int low =0;
            int high = matrix[0].length * matrix.length - 1;
            while(low<=high){
                int mid = (low + high)/2;
                int row = mid / matrix[0].length;
                int col = mid % matrix[0].length;
                if (matrix[row][col] == target){
                    return true;
                }
                else if (matrix[row][col] < target){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
                
            }
            return false;
            
        }
}
