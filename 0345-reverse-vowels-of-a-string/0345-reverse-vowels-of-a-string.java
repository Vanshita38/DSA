class Solution {
    public String reverseVowels(String s) {
        char []str = new char[s.length()];
        for(int e = 0;e<s.length();e++) str[e] = s.charAt(e);
        int e= 0;
        int f = str.length-1;
        char g;
        while(e<f)
        {
            while(e<f && !(isVowel(str[e]))) e++;
            while(e<f && !(isVowel(str[f]))) f--;
            g = str[e];
            str[e] = str[f];
            str[f] = g;
             e++;
            f--;
        }
         return new String(str);

    }
        public boolean isVowel(char a)
        {
            return (a == 'a' || a == 'A' || a == 'e' || a == 'E' || a == 'i' || a == 'I' ||a == 'o'|| a == 'O' || a == 'u' || a == 'U' );
        }
    
}