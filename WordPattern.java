// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap();
        String [] splited = s.split(" ");
        HashSet<String> set = new HashSet<>();
        if(pattern.length()!=splited.length)
            return false;
        for(Integer i = 0; i<splited.length;i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(splited[i]))
                    return false;
            }
            else{
                if(set.contains(splited[i]))
                    return false;
                else{
                map.put(pattern.charAt(i),splited[i]);
                set.add(splited[i]);
                }
            }
        }
        return true;
    }
}