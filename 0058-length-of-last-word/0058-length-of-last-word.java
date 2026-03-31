class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int e = s.length()-1;
        while(e>=0 && s.charAt(e) == ' ') e--;
        while(e>=0 && s.charAt(e) != ' ')
        {
            e--;
            count++;
        }
        return count;

    }
}