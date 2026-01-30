class Solution {
    public boolean isSubsequence(String s, String t) {
         if(t.length() == 0 && s.length() == 0) return true;
        else if(t.length() == 0) return false;
        int e = -1;
        int k = 0;
        int f = 0;
        for(e = 0;e<s.length();e++)
        {
            if(f == t.length()) return false;
            while(f<t.length())
            {
                if(f == t.length()-1 && t.charAt(f)!=s.charAt(e) ) return false;
                if(t.charAt(f)==s.charAt(e))
                {
                    f++;
                    break;
                } 
                f++;
            }
        }
        if(e == s.length()) return true;
        else return false;
    }
}