class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int smallest = nums[start];
        int mid = nums[start];
       
       while(start<=end)
        {
            mid = start+(end-start)/2;
            //if(smallest>nums[mid]) smallest = nums[mid];
            if(nums[mid]<nums[end])
            {
                end = mid-1;
            }
            else
            {
               start = mid+1;
            }    
        }
        return nums[mid];
       
    }
}