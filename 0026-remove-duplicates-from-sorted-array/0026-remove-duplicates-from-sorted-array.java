class Solution {
    public int removeDuplicates(int[] nums) {
        int e = 0;
        int f = 1;
        int g,count = 1;
        while(f<nums.length)
        {
            if(nums[e] == nums[f]) f++;
            else
            {
                e++;
                nums[e] = nums[f];
                count++;
            }
        }

      
        return count;
    }
}