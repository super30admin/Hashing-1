/*
*  Isomorphic String
*  Use 1 hashmap to map the characters and one visited boolean array to check if anything is already visiting and trying to assign different value
*/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> hm = new HashMap();
        boolean[] marked = new boolean[127];
        int i = 0;


        while(i < s.length()) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if(hm.containsKey(c2)) {
                if(hm.get(c2) != c1) return false;
            }else {
                if(!marked[c1]) {
                    hm.put(c2, c1);
                    marked[c1] = true;
                }else {
                    return false;
                }
            }

            i++;
        }

        return true;
    }
}