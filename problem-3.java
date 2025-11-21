// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :None

// Your code here along with comments explaining your approach in three sentences only
//maintain 2 hashmaps one for s to t mapping and other for t to s mapping
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        String[] s_split = s.split(" ");

        if (s_split.length != pattern.length()){
            return false;
        }

        for(int i =0; i < pattern.length(); i ++){
            char p_char = pattern.charAt(i);
            String s_char = s_split[i];
            if(map1.containsKey(p_char)){
                if(!map1.get(p_char).equals(s_char)){
                    return false;
                }
            }else{
                map1.put(p_char,s_char);
            }
            if(map2.containsKey(s_char)){
                if(!map2.get(s_char).equals(p_char)){
                    return false;
                }
            }else{
                map2.put(s_char,p_char);
            }
        }

        return true;
        
    }
}