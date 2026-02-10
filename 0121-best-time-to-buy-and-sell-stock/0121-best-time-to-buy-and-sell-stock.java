class Solution {
    public int maxProfit(int[] prices) {
        int maxdiff = 0;
        int min = prices[0];
        int max = prices[0];
        int indexOfMin = 0;
        int indexOfMax = 0;
         for(int e = 0;e<prices.length;e++)
         {
            if(e<prices.length && min>prices[e])
            {
                min = prices[e];
                indexOfMin = e;
            }
            if(indexOfMin>indexOfMax)
            {
               max = min;
               indexOfMax = indexOfMin;
              // maxdiff = 0;
            }
            if(max<prices[e])
            {
                max = prices[e];
                indexOfMax = e;
            }
            if(maxdiff<max-min) maxdiff = max-min;
         }
        //if(diff<max-min) diff = max-min;
         return maxdiff;
           }
}