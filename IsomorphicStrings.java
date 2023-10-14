/**
Time complexity - O(n) where n is the length of the input string.
Space complexity - O(n) 
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null && t == null)
            return true;
        if(s == null || t == null)
            return false;
        
        if(s.length() != t.length())
            return false;

        Map<Character, Character> map = new HashMap<Character, Character>();
        //Map<Character, Character> revMap = new HashMap<Character, Character>();
        
        for(int i = 0; i < s.length(); i++) {
            char src = s.charAt(i);
            char tar = t.charAt(i);
            if(map.containsKey(src)) {
                if(tar != map.get(src))
                    return false;
            } 
            else if(map.containsValue(tar))
                return false;
            else {
                map.put(src, tar);
                //revMap.put(tar, src);
            }
        }

        return true;
    }
}
