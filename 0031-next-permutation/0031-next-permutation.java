class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        int n = nums.length-1;
        int nextNum = 0;
        int g,indexOfPivot = 0;
        for(int e = 0;e<n;e++)
        {
            if(nums[e]<nums[e+1]) 
            {
                indexOfPivot = e;
                pivot = nums[e];
            }
        }
        if(pivot == -1)
        {
            for(int e = 0;e<n;e++,n--)
        {
               g = nums[e];
               nums[e] = nums[n];
               nums[n] = g;
        }

           return;
        }
        for(int e = n;e>0;e--)
        {
            if(nums[e] > pivot)
            {
                g = nums[e];
                nums[e] = pivot;
                nums[indexOfPivot] = g;
                break;
            }
        }
        
        for(int e = indexOfPivot+1;e<n;e++,n--)
        {
               g = nums[e];
               nums[e] = nums[n];
               nums[n] = g;
        }
    }
}