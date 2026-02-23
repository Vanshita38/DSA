class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int start = 0;
        int end = nums.length-1;
        int mid;
        while(start<=end)
        {
            mid = start+(end-start)/2;
            if(nums[mid]<target) start = mid+1;
            else if(nums[mid]>target) end = mid-1;
            else
            {
                if(start<mid)
                {
                    while(nums[start] != target) start++;
                }
                if(end>mid)
                {
                    while(nums[end] != target) end--;
                }
                ans[0] = start;
                ans[1] = end;
                break;
            }
        }
        return ans;
    }
}