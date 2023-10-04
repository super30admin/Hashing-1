// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class IsomorphicStrings {
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            int sLen = s.length(), tLen = t.length();
            if(sLen != tLen) return false;
            if(sLen == 0 || tLen == 0) return false;
            if(s == null && t == null) return true;

            HashMap<Character,Character> map = new HashMap<>();
            Set<Character> set = new HashSet<>();

            for(int i = 0; i < sLen; i++){
                char sChar = s.charAt(i);
                char tChar = t.charAt(i);

                if(map.containsKey(sChar)){
                    if(map.get(sChar) != tChar){
                        return false;
                    }
                }
                else{
                    if(set.contains(tChar)){
                        return false;
                    }
                    else{
                        map.put(sChar, tChar);
                        set.add(tChar);
                    }
                }
            }
            return true;
        }
    }
}
