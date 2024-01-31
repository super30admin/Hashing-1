// Time Complexity : O(n), n = length of string
// Space Complexity : O(1) because at max there can be only 26 characters in the map
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : had to watch the video again to understand hashset solution


// Your code here along with comments explaining your approach

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Character> sMap = new HashMap<>(); // to map character of s to t characters
        HashSet<Character> tSet = new HashSet<>(); // to search over the values of sMap in O(1) 

        for(int i = 0; i < s.length() ; i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar)
                    return false;
            }
            else{
                if(tSet.contains(tChar)){ // tChar is already mapped to some other character already
                    return false;
                }

                sMap.put(sChar,tChar);
                tSet.add(tChar);
            }
        }

        return true;
    }
}