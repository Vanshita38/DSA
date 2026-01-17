class Solution {
    public int search(int[] nums, int target) {
        int g = -1;
        int mid = 0;
        int start = 0;
        int end = nums.length-1;
        while(start<=end)
        {
            mid = start+(end-start)/2;
            if(target == nums[mid])
            {
                g = mid;
                break;
            }
            if(nums[mid]>target) end = mid-1;
            else start = mid+1;
        }
        return g;
    }
}