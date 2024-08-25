public class max_profit{
    public static void main(String[] args){
        int[] arr = {7,6,4,3,1};
        int min_day = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i=0;i<arr.length;i++){
            min_day = Math.min(min_day, arr[i]);
            max_profit = Math.max(max_profit, arr[i] - min_day);
        }
        System.out.println(max_profit);
    }
}