class Solution {
    public String mergeAlternately(String word1, String word2) {
        String g = "";
        int e;
        if(word1.length()>word2.length())
        {
            for(e = 0;e<word2.length();e++)
            {
                g += word1.charAt(e);
                g += word2.charAt(e);
            }
            while(e<word1.length())
            {
                g += word1.charAt(e);
                e++;
            }
        }
        else 
        {
            for(e = 0;e<word1.length();e++)
            {
                g += word1.charAt(e);
                g += word2.charAt(e);
            }
             while(e<word2.length())
            {
                g += word2.charAt(e);
                e++;
            }
        }
        return g;
    }
}