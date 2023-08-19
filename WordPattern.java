// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashSet;

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] mapper = new String[26];
        String[] sArr = s.split(" ");
        HashSet<String> sSet = new HashSet<>();
        if(pattern.length() != sArr.length) return false;
        for(int i = 0; i < pattern.length(); i++) {
            char pattChar = pattern.charAt(i);
            if(mapper[pattChar - 'a'] != null) {
                if(!mapper[pattChar - 'a'].equals(sArr[i])) return false;
            } else {
                if(sSet.contains(sArr[i])) return false;
                else {
                    sSet.add(sArr[i]);
                    mapper[pattChar - 'a'] = sArr[i];
                }
            }
        }
        return true;
    }
}
