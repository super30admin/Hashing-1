/**
Time Complexity - O(n) where n is the length of the pattern.
Space Complexity - O(n)
 */
class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        if(s == null && pattern == null)
            return true;
        
        if(s == null || pattern == null)
            return false;

        String[] strs = s.split(" ");

        if(pattern.length() != strs.length) 
            return false;

        Map<Character, String> map = new HashMap<Character, String>();

        for(int i = 0; i < strs.length; i++) {
            char p = pattern.charAt(i);
            String str = strs[i];
            if(str == null || str.length() == 0)
                return false;
            if(map.containsKey(p)) {
                if(!map.get(p).equals(str))
                    return false;  
            }
            else {
                if(!map.containsValue(str))
                    map.put(p, str);
                else 
                    return false;
            }
        }
        return true;
    }
}
