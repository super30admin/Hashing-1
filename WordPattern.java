// Time Complexity : O(n + k) where n is length of pattern and k is average length of s
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Did not initally check for edge conditions


// Your code here along with comments explaining your approach
// Similar to isomorphic strings, we traverse through pattern and start creating a mapping
// In a separate hashset we store the values of the hashmap so that we can check and return false if a mapping has already been created 
// While traversing we check if we come across a character that deviates from the mapping, then we return false

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap <Character, String> map = new HashMap<>();
        HashSet <String> set = new HashSet<>();
        String[] strArr = s.split(" ");
        if(strArr.length!=pattern.length())
            return false;
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            if(!map.containsKey(ch)){
                if(set.contains(strArr[i]))
                    return false;
                map.put(ch,strArr[i]);
                set.add(strArr[i]);
            }
            else{
                if(!map.get(ch).equals(strArr[i]))
                    return false;
            }
        }
        return true;
    }
}
