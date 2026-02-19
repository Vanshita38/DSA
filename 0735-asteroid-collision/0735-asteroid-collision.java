class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack <Integer> s = new Stack<>();

        for(int e = 0;e<asteroids.length;e++)
        {
            if(s.empty() || asteroids[e]>0 || s.peek()<0) s.push(asteroids[e]);
            else 
            { 
               if(s.peek()+asteroids[e] == 0) s.pop();
               else if(s.peek()<0) s.push(asteroids[e]);
               else
               {
                while(!s.empty() && s.peek()+asteroids[e]<=0)
                {
                    if(s.peek()<0) 
                    {
                        s.push(asteroids[e]);
                        break;
                    }
                    else if(s.peek()+asteroids[e] == 0) 
                    {
                        s.pop();
                        break;
                    }
                    else 
                    {
                        s.pop();
                        if(s.empty()) 
                        {
                            s.push(asteroids[e]);
                            break;
                        }
                    }
                }
               }
            }
        }
        int ans[] = new int[s.size()];
        for(int e = ans.length-1;e>=0;e--) ans[e] = s.pop();
        return ans;
    }
}