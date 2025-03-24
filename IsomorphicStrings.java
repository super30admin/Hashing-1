class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sMap = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i< s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap.containsKey(sChar)) {
                if(sMap.get(sChar) != tChar) return false;
            }
            else {
                if(set.contains(tChar)) return false;
                sMap.put(sChar, tChar);
                set.add(tChar);
            }

        }
        return true;
        
    }
}