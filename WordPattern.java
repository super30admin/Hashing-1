/*
 * Time complexity O(nk)
 * Space complexity = O(nk), nk = total length of String s
 * 
 */


class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<> ();
        HashMap<String, Character> smap = new HashMap<> ();


        String[] strs = s.split(" "); // O(nk)

        if (strs.length != pattern.length()) return false;

        for (int i=0; i<pattern.length(); i++) {
            char ch = pattern.charAt(i);            
            if (!map.containsKey(ch)) { 
    
                map.put(ch, strs[i]);
            }
            else {
                if (!map.get(ch).equals(strs[i])) return false;
            }


            // String to pattern map
            if (!smap.containsKey(strs[i])) { // O(nk)
                smap.put(strs[i],ch);
            }
            else {
                if (!smap.get(strs[i]).equals(ch)) return false;
            }


        }

        return true;

    }
}