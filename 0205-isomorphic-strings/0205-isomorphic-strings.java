class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map <Character,Character>map1 = new HashMap<>();
        Map <Character,Character>map2 = new HashMap<>();
        for(int e = 0;e<s.length();e++)
        {
            if(map1.containsKey(s.charAt(e)))
            {
                if(map1.get(s.charAt(e)) != t.charAt(e)) return false;
            }
            else
            {
                map1.put(s.charAt(e),t.charAt(e));
            }

             if(map2.containsKey(t.charAt(e)))
            {
                if(map2.get(t.charAt(e)) != s.charAt(e)) return false;
            }
            else
            {
                map2.put(t.charAt(e),s.charAt(e));
            }
        }
        return true;
    }
}