import java.util.HashMap;
// Time Complexity :O (N) `where N is the length of the string s or t`
// Space Complexity :O(26) which is O(1) since we are using two hashmaps to store the mapping of characters from s to t and t to s, and the maximum number of unique characters is 26 (assuming only lowercase letters).
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach in three sentences only
// We will maintain 2 hashmaps for s and t.
// We will go through each character of s and t, and check if the mapping exists in the respective hashmaps.
// If the mapping exists, we will check if it matches the corresponding character in t and s respectively.
//  If it does not match, we will return false. If the mapping does not exist,

class Solution {
    public boolean isIsomorphic(String s, String t) {
             HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();


        for(int i=0;i<s.length();i++)
        {
             char schar=s.charAt(i);
             char tchar=t.charAt(i);

             if(sMap.containsKey(schar))
             {
                if(sMap.get(schar)!=tchar) return false;
             }
             else
             {
                sMap.put(schar,tchar);
             }

             if(tMap.containsKey(tchar))
             {
                if(tMap.get(tchar)!=schar) return false;
             }
             else
             {
                tMap.put(tchar,schar);
             }
        }
        return true;
    }
}