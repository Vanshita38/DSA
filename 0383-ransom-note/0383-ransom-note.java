class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map <Character,Integer> map = new HashMap<>();
        int count = 1;
        for(int e = 0;e<magazine.length();e++)
        {
            if(map.containsKey(magazine.charAt(e))) map.put(magazine.charAt(e),map.get(magazine.charAt(e))+1);
            else map.put(magazine.charAt(e),count);
        }
        for(int e = 0;e<ransomNote.length();e++)
        {
            if(map.containsKey(ransomNote.charAt(e))) 
            {
                if(map.get(ransomNote.charAt(e))>1) map.put(ransomNote.charAt(e),map.get(ransomNote.charAt(e))-1);
                else map.remove(ransomNote.charAt(e));
            }
            else return false;;

        }
        return true;
        
    }
}