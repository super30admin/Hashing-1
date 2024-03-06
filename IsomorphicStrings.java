class Solution {

    //Time Complexity -> O(N + M), where N is the length of s and M is the length of t
    // Space Complexity -> O(1), O(1) for HashMap as max keys inserted will be ASCII i.e., max of 256 in either map or set
    /**
    Steps:
    1. Compare every char from s with its respective char from t
    2. We need 2 way mapping reference, so we use 1 HashMap to map s characters as key and t characters as values and a HashSet to check if the t character already existed in the set to avoid reverse duplication
     */
    public boolean isIsomorphic(String s, String t) {
        if(s == null || s.length() == 0 || t == null || t.length() == 0) return false;
        if(s.length() != t.length()) return false;
        Map<Character, Character> map= new HashMap<>();
        Set<Character> trackChars = new HashSet<>();

        for(int i = 0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!map.containsKey(sChar) && trackChars.contains(tChar)) return false;
            else if(!map.containsKey(sChar)){
                map.put(sChar, tChar);
                trackChars.add(tChar);
            }
            else if(!map.get(sChar).equals(tChar)) return false;
        }
        return true;
    }
}
