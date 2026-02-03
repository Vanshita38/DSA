class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int middle = Integer.MAX_VALUE;
        int max;
        for(int e = 0;e<nums.length;e++)
        {
            max = nums[e];
            if(min>max) min = max;
            else if(middle>max) middle  = max;
            else return true;
        }
        return false;
    }
}