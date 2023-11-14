// 1 array, 1 HashSet

// Time Complexity : O(n)
// Space Complexity : O(k)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * It uses an array to map a character to a string and uses it for validation later. it uses a hashset to store unique words
 * which can be used to validate if a word is already mapped to some other character
 */

class Solution {
    public boolean wordPattern(String pattern, String s) {

        if(pattern == null || pattern.length() == 0 || s == null || s.length() == 0) return false;

        Set<String> set = new HashSet<>();  //SC: O(1)
        String[] sArr = s.split(" ");  // SC: O(k)
        String[] sMap = new String[26]; //SC: O(1)

        if(pattern.length() != sArr.length) return false;

        for(int i=0; i<pattern.length(); i++) {

            char c = pattern.charAt(i);
            String str = sArr[i];

            if(sMap[c-'a'] != null) {
                if(!sMap[c-'a'].equals(str)) return false;
            }
            else {
                if(set.contains(str)) return false;
                set.add(str);
                sMap[c-'a'] = str;
            }
        }

        return true;
    }
}