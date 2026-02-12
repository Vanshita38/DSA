class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        String[] s = new String[strs.length];
        Set<String> set = new HashSet<>();
        for(int e = 0;e < strs.length;e++)
        {
            char a[] = strs[e].toCharArray();
            Arrays.sort(a);
            s[e] = new String(a);
        }
        String num;
        for(int e = 0;e<strs.length;e++)
        {
        if(set.contains(s[e])) continue; 
        set.add(s[e]);   
        list1 = new ArrayList<>();
        for(int f = 0;f < s.length;f++)
        {
        if(s[f].equals(s[e])) list1.add(strs[f]);
        }
        list.add(list1);
        }
        return list;
    }
}