class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length];
       Map <Integer,Integer> map = new HashMap<>();
       Stack <Integer> stack = new Stack<>();
       for(int e = nums2.length-1;e>=0;e--)
       {
        while(stack.size() > 0 && stack.peek()<= nums2[e]) stack.pop();
        if(stack.empty()) map.put(nums2[e],-1);
        else map.put(nums2[e],stack.peek());
        stack.push(nums2[e]);
       }
        for(int i = 0;i<nums1.length;i++)
        {
            arr[i] = map.get(nums1[i]);
        }






         return arr;
    }
}