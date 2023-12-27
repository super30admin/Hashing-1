/*
 * Split the words in the second string by space.
 * 
 * Hashmap for storing pattern to S mappings
        Hashset to store values of S.

 Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(c) - c length of the word.
* 
* Space Complexity: O(1) 
 */

 class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" "); 
        HashMap<Character, String> hMap = new HashMap<>();
        HashSet<String> hSet = new HashSet<>();

        if(pattern.length() != words.length) return false;
        
        for(int i=0; i < pattern.length(); i++)
        { 
            char c = pattern.charAt(i);
            
            if(hMap.containsKey(c))
            {
               if (!hMap.get(c).equals(words[i]))
                    return false;
            } 
            else{
                if(!hSet.contains(words[i]))
                {
                    hSet.add(words[i]);
                    hMap.put(c,words[i]);
                }
                else return false;
            }
        }
        return true;
    }
}