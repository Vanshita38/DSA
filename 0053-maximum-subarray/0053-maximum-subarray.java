class Solution {
    public int maxSubArray(int[] nums) {
        int lmax = nums[0];
        int gmax = nums[0];
        int i = 1;
        while(i<nums.length)
        {
            int j = lmax+nums[i];
                if(nums[i]>j) lmax = nums[i];
                else lmax = j;
                if(lmax>gmax) gmax = lmax;        
                 i++;
        }
        //if(gmax < 0 && nums.length != 1) return 0;
        return gmax;
    }
}
