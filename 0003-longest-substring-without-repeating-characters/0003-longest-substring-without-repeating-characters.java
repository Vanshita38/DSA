class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        int maxlength = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int e = 0, f = 0; f < s.length(); f++) {
            if(map.containsKey(s.charAt(f))) {
                e = Math.max(map.get(s.charAt(f)) + 1, e);
            }
            map.put(s.charAt(f), f);
            length = f - e + 1;
            maxlength = Math.max(maxlength, length);
        }
        return maxlength;
    }
}
