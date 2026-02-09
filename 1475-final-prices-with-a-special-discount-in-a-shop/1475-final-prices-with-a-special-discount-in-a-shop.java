class Solution {
    public int[] finalPrices(int[] prices) {
        int ans[] = new int[prices.length];
        Stack <Integer> s = new Stack<>();
        for(int e = prices.length-1;e>=0;e--)
        {
            if(s.empty())
            {
                ans[e] = prices[e];
                s.push(prices[e]);
            }
            else
            {
                while(s.size()>0 && s.peek()>prices[e]) s.pop();
                if(s.empty()) ans[e] = prices[e];
                else ans[e] = prices[e]-s.peek();
                s.push(prices[e]);
            }
        }
        return ans;
    }
}