/**
 *  Word Pattern
 *  Same a isomorphic string but this time key was string which was splitted by space.
 */

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<String, Character> hm = new HashMap();
        boolean[] marked = new boolean[26];
        String[] sArray = s.split(" ");

        if(pattern.length() != sArray.length) return false;

        int i = 0;

        while(i < pattern.length()) {
            char c = pattern.charAt(i);

            if(hm.containsKey(sArray[i])) {
                if(hm.get(sArray[i]) != c) return false;
            }else {
                if(!marked[c - 'a']) {
                    hm.put(sArray[i], c);
                    marked[c - 'a'] = true;
                }
                else return false;
            }

            i++;
        }   

        return true;
    }
}