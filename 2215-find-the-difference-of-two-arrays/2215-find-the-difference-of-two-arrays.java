class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        List <Integer> list1 = new ArrayList<>();
        List <Integer> list2 = new ArrayList<>();
        Map <Integer,Integer> map1 = new HashMap<>();
        Map <Integer,Integer> map2 = new HashMap<>();
        for(int e = 0;e<nums1.length;e++) map1.put(nums1[e],e);
        for(int e = 0;e<nums2.length;e++)  map2.put(nums2[e],e);
        for(int e = 0;e<nums1.length;e++) if(!(map2.containsKey(nums1[e])) && !(list1.contains(nums1[e]))) list1.add(nums1[e]);
        for(int e = 0;e<nums2.length;e++)    if(!(map1.containsKey(nums2[e])) && !(list2.contains(nums2[e]))) list2.add(nums2[e]);
        list.add(list1);
        list.add(list2);
        return list;

    }
}