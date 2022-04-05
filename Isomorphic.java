// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> smap = new HashMap<>();
        //HashMap<Character,Character> tmap = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i =0; i<s.length(); i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if(!smap.containsKey(cs)){
                smap.put(cs,ct);
                if(set.contains(ct))
                    return false;
                else
                    set.add(ct);
            }
            else{
                if(smap.get(cs)!=ct)
                    return false;
            }
        }
        return true;
    }
}