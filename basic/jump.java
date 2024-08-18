public class jump {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int n = arr.length;
        System.out.println(minJumps(arr, n));   
    }
    static int minJumps(int[] arr, int n) {
        // your code here
        int count = 0;
        int  i =0;
        while(i<n){
            if (arr[i]== 0){
                return -1;
            }
            else{
                i = arr[i];
                count++;
            }
        }
        return count;
    }
}
