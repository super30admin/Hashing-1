// Determine if strings are isomorphic https://github.com/Harshit-Chouksey/Hashing-1

// Time Complexity : O(s.length)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach in three sentences only
// approach: We define a hashmap and a hashset. We use the hashmap to map all the characters from string s to string t. Whereas the hashset is used to make sure if an element from t which has been already mapped to s, is not being mapped to any other character from s.


class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }

        HashMap<Character,Character> sMap = new HashMap<>();
        HashSet<Character> tMap = new HashSet<>();

        for(int i=0; i<s.length();i++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar))
            {
                if(sMap.get(sChar)!=tChar)
                {
                    return false;
                }
                
            }
            else
            {
                sMap.put(sChar,tChar);
                if(tMap.contains(tChar))
                {
                    return false;
                }
                else
                {
                    tMap.add(tChar);
                }
            }
        }
        return true;
        
    }
}