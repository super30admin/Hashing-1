// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class SolutionIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sMap = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        
        // Store character to character mapping
        for(int i = 0; i < s.length(); i++){
            if(sMap.containsKey(s.charAt(i))){
                if(sMap.get(s.charAt(i))!=t.charAt(i)){ // if character in t does not match already existing value against the key of s return false
                    return false;
                }
            }else{
                if(set.contains(t.charAt(i))){ // if character in t is already mapped against another value in s return false
                    return false;
                }else{
                    sMap.put(s.charAt(i),t.charAt(i));
                    set.add(t.charAt(i));                    
                }
            }
        }
        return true;
    }
}
