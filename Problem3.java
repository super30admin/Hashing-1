// Time Complexity : O(N)
// Space Complexity: O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }
        for(int i = 0; i < pattern.length(); i++){
            Character sChar = pattern.charAt(i);
            String t = words[i];
            if(map.containsKey(sChar)){
                if(!map.get(sChar).equals(t)){
                    return false;
                }
            }
            else{
                if(set.contains(t)){
                    return false;
                }else{
                    map.put(sChar, t);
                    set.add(t);
                }
            }
        }
        return true;
    }
}