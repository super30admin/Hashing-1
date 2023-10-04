// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class WordPattern {
    class Solution {
        public boolean wordPattern(String pattern, String s) {
            String[] strArr = s.split(" ");

            int patternLen = pattern.length(), strArrLen = strArr.length;

            if(patternLen != strArrLen) return false;

            Map<Character, String> map = new HashMap<>();
            Set<String> set = new HashSet<>();

            for(int i = 0; i < patternLen; i++){
                char patternChar = pattern.charAt(i);
                String str = strArr[i];

                if(map.containsKey(patternChar)){
                    if(!map.get(patternChar).equals(str)){
                        return false;
                    }
                }
                else{
                    if(set.contains(str)){
                        return false;
                    }
                    else{
                        map.put(patternChar, str);
                        set.add(str);
                    }
                }
            }
            return true;
        }
    }
}
