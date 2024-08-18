public class stock_121 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int n = prices.length;
        int buy_price = Integer.MAX_VALUE;
        int Max_profit = 0;
        for(int i = 0; i < n; i++){
            if(buy_price < prices[i]){
                int profit = prices[i] - buy_price;
                Max_profit = Math.max(Max_profit,profit);
            }
            else{
                buy_price = prices[i];
            }
        }
        System.out.println(Max_profit);
    }
}
