// Time Complexity : O(n) we traverse through s and t linearly
// Space Complexity : O(1) we will only map upto 26 characters (total number of alphabets)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No, used the lessons learned in class


public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        //int i = 0;
        for(int i = 0; i < s.length(); i++){
            char s_c = s.charAt(i);
            char t_c = t.charAt(i);
            if(!map.containsKey(s_c)){
                map.put(s_c, t_c);
                if(set.contains(t_c)){
                    return false;
                }
                set.add(t_c);
            }else{
                if(map.get(s_c) != t_c){
                    return false;
                }
            }
        }
        if(map.size() != set.size()){
            return false;
        }
        return true;
    }
}
