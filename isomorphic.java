// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Calculating space complexity

// Approach : we are traversing any of the one string. We are checking the each character if it is present in the map
// then the value should be equal to character at the same index of the other string (tchar). If it is not present in the map we will check if the
// tchar is already there in the set which means a character in t is getting associated for 2 characters in s. 
// if the set doesn't contain tchar add the schar to map and tchar to set

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null && t==null) return true;
        if(s==null || t==null) return false;
        if(s.length() != t.length()) return false;

        HashMap<Character ,Character> sMap = new HashMap<>();
        HashSet<Character> set = new HashSet<>();


        for(int i=0;i<s.length();i++)
        {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(!sMap.containsKey(schar)){
                if(set.contains(tchar)) return false;
                else{
                    sMap.put(schar,tchar);
                    set.add(tchar);
                }
            } else {
                if(sMap.get(schar) != tchar) return false;
            }
        }
    return true;
        
    }
}