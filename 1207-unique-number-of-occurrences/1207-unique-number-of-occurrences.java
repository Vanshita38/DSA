class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int e = 0;e<arr.length;e++)
        {
            if(map.containsKey(arr[e]))
            {
                map.put(arr[e],map.get(arr[e])+1);
            }
            else map.put(arr[e],1);
        }
        Set <Integer>set = new HashSet<>();
            for(Integer num:map.values())
            {
                if(set.contains(num)) return false;
                else set.add(num);
            }
            return true;
    }
}