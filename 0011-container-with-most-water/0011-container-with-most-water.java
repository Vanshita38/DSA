class Solution {
    public int maxArea(int[] height) {
        int e = 0;
        int f = height.length-1;
        int max = 0;
        int total = 0;
        while(e<f)
        {
            if(height[e]<=height[f])
            {
                total = height[e]*(f-e);
                e++;
            }
            else
            {
                total = height[f]*(f-e);
                f--;
            }
            if(total>max) max = total;
        }
        return max;
    }
}