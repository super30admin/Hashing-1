// Time Complexity :
//      n - size of either string 
//      isIsomorphic() - O(n)
//      
// Space Complexity :
//      isIsomorphic() - O(1)
//
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Problem2 {
	public boolean isIsomorphic(String s, String t) {
        //edge case
        if(s.length() != t.length())
            return false;
        else
        {
            HashMap<Character, Character> sHash = new HashMap<>();
            HashMap<Character, Character> tHash = new HashMap<>();
            
            for(int i = 0; i < s.length(); ++i)
            {
                if(!sHash.containsKey(s.charAt(i)))
                {
                    sHash.put(s.charAt(i), t.charAt(i));
                }
                else
                {
                    if(sHash.get(s.charAt(i)) != t.charAt(i))
                        return false;
                }
                
                if(!tHash.containsKey(t.charAt(i)))
                {
                    tHash.put(t.charAt(i), s.charAt(i));
                }
                else
                {
                    if(tHash.get(t.charAt(i)) != s.charAt(i))
                        return false;
                }
            }
            return true;
        }
    }
}