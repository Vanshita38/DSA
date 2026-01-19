class Solution {
    public int searchInsert(int[] nums, int target) {
        int mid = 0;
        int start = 0;
        int end = nums.length-1;
        if(nums.length == 1) 
        {
            if(target == nums[0] || target<nums[0]) return 0;
            else return 1;
        }
        while(start<=end)
        {
            mid = start + (end-start)/2;
            if(target == nums[mid]) return mid;
            if(target<nums[mid]) end= mid-1;
            else start = mid+1;
        }
        return start;
    }
}