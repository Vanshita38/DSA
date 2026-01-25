class Solution {
    public int removeElement(int[] nums, int val) {
        int f = nums.length-1;
        int e = 0;
        int g,count = 0;
        while(e<=f)
        {
            while(e<=f && nums[e] != val)
            {
                count++;
                e++;
            }
            while(f>=0 && nums[f] == val) f--;
            if(e<f)
            {
                g = nums[e];
                nums[e] = nums[f];
                nums[f] = g;
            }
        }
        return count;
      
    }
}