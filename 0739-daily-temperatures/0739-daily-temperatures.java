class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int ans[] = new int[temperatures.length];
        Stack <Integer> s = new Stack<>();
        for(int e = temperatures.length-1;e>=0;e--)
        {
            if(s.empty()) 
            {
                s.push(e);
                ans[e] = 0;
            }
            else
            {
                while(s.size()>0 && temperatures[s.peek()]<=temperatures[e]) s.pop();
                if(s.empty() == false && temperatures[s.peek()]>temperatures[e]) ans[e] = s.peek()-e;
                else ans[e] = 0;
                s.push(e);
            

            }
        }
        return ans;      
    }
}