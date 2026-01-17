class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int n = nums.length;
        for (int  e = 0;e<n;e++)
        {
            if(nums[e] != 0)
            {
                nums[i] = nums[e];
                i++;
            }
        }
        while(i<n)
        {
            nums[i] = 0;
            i++;
        }
    }
}