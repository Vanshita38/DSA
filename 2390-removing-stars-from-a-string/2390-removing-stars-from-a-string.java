class Solution {
    public String removeStars(String s) {
        Stack <Character> stack = new Stack<>();
        for(int e = 0;e<s.length();e++)
        {
          if(s.charAt(e) == '*') stack.pop();
          else stack.push(s.charAt(e));
        }
        String g = "";
        while(!stack.empty())
        {
           g = g+stack.peek();
           stack.pop();
        }
        String reversed = new StringBuilder(g).reverse().toString();
        return reversed;
    }
}