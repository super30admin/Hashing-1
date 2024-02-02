// Time Complexity : O(n) where n is length of the strings.  
// Space Complexity : O(1)  // not sure about space complexity 
// Did this code successfully run on Leetcode  : Yes
// Any problem you faced while coding this : No 
class Solution {
    public boolean isIsomorphic(String s, String t) {
      HashSet<Character> visited = new HashSet<>();
      HashMap<Character, Character> map = new HashMap<>();
      char value;
        for(int i=0;i<s.length();i++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!map.containsKey(sChar))
            {
                System.out.println(sChar+":"+tChar);
                if(!visited.contains(tChar))
                {
                map.put(sChar,tChar);
                visited.add(tChar);  
                }else{
                    return false;
                }
            }else{
                value = map.get(sChar);
                System.out.println(sChar+":"+tChar+":"+value);
                if(value!=tChar)
                {
                    return false;
                }
            }
        }
        return true;
    }
}