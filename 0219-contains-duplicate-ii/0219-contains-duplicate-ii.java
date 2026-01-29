class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    Map <Integer,Integer> map = new HashMap<>();
    int num;
    for(int i = 0;i<nums.length;i++)
    {
        if(map.containsKey(nums[i]))
        {
            num = map.get(nums[i]);
            if(Math.abs(num-i)<=k) return true;
        }
       map.put(nums[i],i);
    }
          return false;
    }
}