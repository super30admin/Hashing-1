//## Problem 3: Given a pattern and a string str, find if str follows the same pattern. https://leetcode.com/problems/word-pattern/

// Time Complexity : O(pattern.length)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach in three sentences only
// approach: we use a hashmap and hashset. mashmap is used to map pattern elements to elements in s. Whereas hashsset is used to confirm if the elements in s have already been mapped to some other character from pattern.

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] strArray = s.split(" ");
        
        if(pattern.length()!=strArray.length)
        {
            return false;
        }

        HashMap<Character, String> pMap = new HashMap<>();
        HashSet<String> sMap = new HashSet<>();

        for(int i=0; i<strArray.length;i++)
        {
            char c = pattern.charAt(i);
            if(!pMap.containsKey(c))
            {
                pMap.put(c,strArray[i]);
                if(sMap.contains(strArray[i]))
                {
                    return false;
                }
                sMap.add(strArray[i]);
            }
            else
            {
                if(!pMap.get(c).equals(strArray[i]))
                {
                    return false;
                }
            }
        }
        return true;


    }
}

