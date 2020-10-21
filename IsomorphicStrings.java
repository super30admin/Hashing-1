// Time Complexity : O(n)
// Space Complexity : O(26) + O(26) = o(1)
// Did this code successfully run on Leetcode :yes 
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

// Map source char to destination char and viceversa
class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        //two map solution 
        // space complexity is o(1) constant since we have 26 chars -- o(26) -> o(1)
        
        if(s.length() != t.length()) {
            return false;
        } // not needed cz they are always equal according to problem 
        
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if(sMap.containsKey(sChar)) {
                if(sMap.get(sChar) != tChar) {
                    return false;
                }
            } else {
                sMap.put(sChar, tChar);
            }  
            if(tMap.containsKey(tChar)) {
                if(tMap.get(tChar) != sChar) {
                    return false;
                }
            } else{
                tMap.put(tChar, sChar);
            }
        }
        return true;
    }
}