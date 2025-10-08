// Time Complexity : O(log n).
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Approach : Two strings are isomorphic. if the characters in s can be replaced to get t. The approach is to store the mappings from s to t as key values pairs
// in the HashMap and we also need to see the mapping from t to s. To avoid the failure in t to s mapping case, I have used hashset so that I can track the duplicates.
// Using another hashmap for t to s mapping is also another option.

// Your code here along with comments explaining your approach




class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(map.containsKey(sChar)){ //checking if it is present in Hashmap
                if (map.get(sChar) != tChar) { //checking if not equal to existing mapping
                    return false;
                }
            }
            else {
                if (set.contains(tChar)) {// duplicate found
                    return false;
                }
                map.put(sChar, tChar);
                set.add(tChar);

            }
        }
        return true;
    }

}