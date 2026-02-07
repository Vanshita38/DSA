class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();
        for(int e = 0;e<s.length();e++)
        {
            if(s.charAt(e) == '[' || s.charAt(e) == '(' || s.charAt(e) == '{')
            { 
                stack.push(s.charAt(e));
            }
            else if(stack.empty() == false)
            {
            if(s.charAt(e) == '}')
            {
                if(stack.peek() == '{') stack.pop();
                else return false;
            }
            else if(s.charAt(e) == ']')
            {
                if(stack.peek() == '[') stack.pop();
                else return false;
            }
            else if(s.charAt(e) == ')')
            {
                if(stack.peek() == '(') stack.pop();
                else return false;
            }
            }
            else return false;
        }
        if(stack.empty() == true) return true;
        return false;
    }
}