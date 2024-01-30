// Time complexity : o(n) where n is the length of the string
// Space Complexity : O(1)


class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character,Character> sHashMap = new HashMap<>();
        HashMap<Character,Character> tHashMap = new HashMap<>();
        for(int i =0; i<s.length();i++) {
            if(sHashMap.containsKey(s.charAt(i))) {
                if(sHashMap.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            } else {
                sHashMap.put(s.charAt(i),t.charAt(i));
            }


            if(tHashMap.containsKey(t.charAt(i))) {
                if(tHashMap.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            } else {
                tHashMap.put(t.charAt(i),s.charAt(i));
            }
        }

     return true;
    }
}