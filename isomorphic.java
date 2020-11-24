// Time Complexity :O(N) where n is the length of the string
// Space Complexity :O(N) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: Stored all the characters of string as key and the mapped character of string t as value in hashmap.
//Also stored all the characters of string t in hashset to check for already presnt values.
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                char check = map.get(s.charAt(i));
                if(check!=t.charAt(i))
                    return false;
            }
            else{
                if(set.contains(t.charAt(i)))
                    return false;
                map.put(s.charAt(i),t.charAt(i));
                set.add(t.charAt(i));
            }
        }
        return true;
    }
}