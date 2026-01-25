class Solution {
    public int[] getConcatenation(int[] nums) {
        int []ans = new int[nums.length*2];
        int f = nums.length;
        for(int e = 0;e<nums.length;e++,f++)
        {
            ans[e] = nums[e];
            ans[f] = nums[e];
        }
        return ans;

        
    }
}