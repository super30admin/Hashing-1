// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// We traverse through the strings s,t and start creating a mapping
// We store the mappings in 2 separate hashmaps to differentiate between s->t and t->s mappings
// While traversing we check if we come across a character that deviates from the mapping, then we return false

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!sMap.containsKey(sChar)) //if s->t mapping doesn't exist
            {
                sMap.put(sChar,tChar); //create s->t mapping.
                if(tMap.containsKey(tChar)&&tMap.get(tChar)!=sChar) //if t->s mapping exists and is different
                        return false;
                tMap.put(tChar,sChar); //create t->s mapping
            }
            else{
                if(sMap.get(sChar)!=tChar) //if mapping already exists, check s->t mapping
                    return false;
                else if(tMap.get(tChar)!=sChar) //if mapping already exists, check t->s mapping
                    return false;
            }
        }
        return true;
    }
}