// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Problem statement: https://leetcode.com/problems/isomorphic-strings/solution/

class Problem2{

        public boolean isIsomorphic(String s, String t) {

            if(s.length() != t.length()){
                return false;
            }

            HashMap<Character, Character> smap = new HashMap<>();
            HashMap<Character, Character> tmap = new HashMap<>();

            for(int i=0;i<s.length();i++){
                char s1 = s.charAt(i);
                char t1 = t.charAt(i);
                if(!(smap.containsKey(s1))){
                    smap.put(s1, t1);
                }else if(!smap.get(s1).equals(t1)){
                    return false;
                }

                if(!(tmap.containsKey(t1))){
                    tmap.put(t1,s1);
                }else if(!tmap.get(t1).equals(s1)){
                    return false;
                }
            }
            return true;

        }
}

