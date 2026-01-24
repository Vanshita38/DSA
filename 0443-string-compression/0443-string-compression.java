class Solution {
    public int compress(char[] chars) {
        int count;
        String s = "";
        s += Character.toString(chars[0]);
        for(int e = 1;e<chars.length;e++)
        {
            if(chars[e] == chars[e-1])
            {
                count = 1;
                while(e<chars.length && chars[e] == chars[e-1])
                {
                    count++;
                    e++;
                }
                s += Integer.toString(count);
                e--;
            }
            else s += Character.toString(chars[e]);
        }
       for(int f = 0;f<s.length();f++)
        {
          chars[f] = s.charAt(f);
        }
        return s.length();
    }
}