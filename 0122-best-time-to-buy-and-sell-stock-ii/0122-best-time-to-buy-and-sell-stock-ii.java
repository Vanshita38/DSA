class Solution {
    public int maxProfit(int[] prices) {
       int buy = prices[0];
       int f,sell = prices[0];
       int profit = 0;
       for(int e = 0;e<prices.length-1;e++)
       {
        if(prices[e+1]<prices[e])profit += (sell-buy);
        else
        {
            buy = prices[e];
            sell = prices[e+1];
            f = e+1;
            while(f<prices.length && prices[f]>=sell)
            {
                sell = prices[f];
                f++;

            } 
            profit += (sell-buy);
            e = f-1;
       
        }
       }
        return profit;
    }
}