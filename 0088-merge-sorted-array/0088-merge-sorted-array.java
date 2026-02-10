class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int e = 0;
        int f = 0;
        while(e<nums1.length && f<nums2.length)
        {
            if(nums1[e]!=0)
            {
                e++;
            continue;
            }
            nums1[e] = nums2[f];
            e++;
            f++;
        }
        Arrays.sort(nums1);
    }
}