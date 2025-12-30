class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(a.length != b.length) return false;
        for(int e = 0;e<a.length;e++)
        {
            if(a[e] != b[e]) return false;
        }
    return true;
    }

}