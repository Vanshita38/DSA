class Solution {
    public boolean isPalindrome(String s) {
       int e = 0;
       int f = s.length()-1;
        while(e<f)
           {
            while (e < f && !Character.isLetterOrDigit(s.charAt(e))) e++;
            while (e < f && !Character.isLetterOrDigit(s.charAt(f))) f--;

            if (Character.toLowerCase(s.charAt(e)) != Character.toLowerCase(s.charAt(f))) return false;
                e++;
                f--;
           }
        return true;
   }
}