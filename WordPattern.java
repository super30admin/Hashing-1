// Time Complexity : 0(1)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        String[] stringArray = s.split(" ");
        if(stringArray.length != pattern.length()) return false;
        for(int i = 0; i< pattern.length(); i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(stringArray[i])) return false;
            }
            else {
                if(set.contains(stringArray[i])) return false;
                map.put(pattern.charAt(i), stringArray[i]);
                set.add(stringArray[i]);
            }
        }
        return true;
    }
}