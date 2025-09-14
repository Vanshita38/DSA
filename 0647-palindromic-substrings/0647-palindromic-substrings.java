class Solution {
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
    public int countSubstrings(String s) {
    int count = 0;
        for(int e = 0;e<s.length();e++)
        {
            for(int f = e;f<s.length();f++)
            {
                if(isPalindrome(s,e,f) == true) count++;
            }
        }
    return count;





    }
}