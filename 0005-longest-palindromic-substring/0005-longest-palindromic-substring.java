class Solution {
    int max = 0,start,end;
    public boolean isPalindrome(String s,int i,int j)
    {
        while(i<j)
        {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        for(int e = 0;e<s.length();e++)
        {
            for(int f = 1;f<s.length();f++)
            {
                if(isPalindrome(s,e,f) == true)
                {
                 if(f-e+1 > max)
                 {
                 max = f-e+1;
                 start = e;
                 end = f;
                 }
                }
            }
        }
         return s.substring(start,end+1);
    }
}