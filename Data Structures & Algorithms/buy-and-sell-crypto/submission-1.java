class Solution {
    public int maxProfit(int[] prices) {
        

        int min_price = Integer.MAX_VALUE;
        int max_profit=0;

        for(int i=0;i<prices.length;i++){
            //case 1: if is lowest part i have seen so far !!
             if(prices[i]<min_price){
                 min_price =prices[i];
                 //case 2: if we sold today, would it beat the previous profit
             } else if (prices[i]-min_price>max_profit){
                  max_profit = prices[i]-min_price;
             }
        }
        return max_profit;
    }
}
