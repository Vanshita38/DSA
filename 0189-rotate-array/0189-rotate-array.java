class Solution {
    public void rotate(int[] nums, int k) {
       int n = nums.length;
       int e = 0;
       int g,f = n-1;
       while(e<f)
       {
        g = nums[e];
        nums[e] = nums[f];
        nums[f] = g;
        e++;
        f--;
       }
       if(k>n) k = k%n;
       e = 0;
       f = k-1;
       while(e<f)
       {
        g = nums[e];
        nums[e] = nums[f];
        nums[f] = g;
        e++;
        f--;
       }
       e = k;
       f = n-1;
       while(e<f)
       {
        g = nums[e];
        nums[e] = nums[f];
        nums[f] = g;
        e++;
        f--;
       }
    }
}