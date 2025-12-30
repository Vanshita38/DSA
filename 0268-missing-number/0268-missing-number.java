class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int num  = 0;
        for(int e = 0;e<nums.length;e++)
        {
         if(nums[e] != num) return num;
         num++;
        }
        return num;
    }
}