class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>map = new HashMap<>();
        for(int e= 0;e<nums.length;e++)
        {
            if(map.containsKey(nums[e]))  map.put(nums[e],(map.get(nums[e])+1));
            else map.put(nums[e],1);
        }
        int max = Integer.MIN_VALUE;
        int maxKey = nums[0];
for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    int key = entry.getKey();
    int value = entry.getValue();
    if (value > max)  
    {
        max = value;
        maxKey = key;
    }
}
return maxKey;
    }
}