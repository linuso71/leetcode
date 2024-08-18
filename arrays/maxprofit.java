public class maxprofit {
    public static void main(String[] args) {
        int[] prices = {2,4,2};
        int maxi = 0;
        int min = 9999;
        int index = 0;
        // int profit = 0;
        // for (int i =0;i<prices.length ;i++){ 
        //     if (prices[i] < min){
        //         min = prices[i];
        //         index = i;
        //     }
        // }
        // if (index == prices.length){
        //     System.out.println("no profit");
        // }
        // else{
        //     for (int j = index ;j<prices.length;j++){
        //         if(prices[j]>maxi){
        //             maxi = prices[j];
        //         }
        //     }
        //     profit= maxi - min;
        // System.out.println(profit);
        // }

        for (int i=0;i<prices.length;i++){
            if (prices[i] > maxi){
                maxi = prices[i];
                index = i;
            }
        }
        System.out.println(maxi);
        for (int j=index;j>-1;j--){
            if (prices[j]<maxi){
                min = prices[j];
            }
        }
        System.out.println(min);
        if (min == 9999){
            System.out.println("no profit");
        }
        else{
        System.out.println(maxi - min);
        }

        
        
    }
}