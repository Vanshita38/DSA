class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length];
        for(int i = 0;i<arr.length;i++) arr[i] = -1;
        Map <Integer,Integer> map = new HashMap<>();
        for(int e = 0;e<nums2.length;e++)
        {
            map.put(nums2[e],e);
        }
        for(int e = 0;e<nums1.length;e++)
        {
            int j = map.get(nums1[e]);
            j++;
            while(j<nums2.length)
            {
                if(nums2[j]>nums1[e])
                {
                    arr[e] = nums2[j];
                    break;
                }
                j++;
            }
        }
         return arr;
    }
}