class Solution {
    public String reverseWords(String s) {
        s = new StringBuilder(s).reverse().toString();
        int e;
        String ans = "";
        for(e = 0;e<s.length();e++)
        {
            String word = "";
            while(e<s.length() && s.charAt(e) != ' ')
            {
                word += String.valueOf(s.charAt(e));
                e++;
            }
            if(word.length() > 0) {
             if(ans.length() != 0) ans = ans + " " + new StringBuilder(word).reverse().toString();
             else ans = ans + new StringBuilder(word).reverse().toString();
            }
             }
        return ans;
    }
}