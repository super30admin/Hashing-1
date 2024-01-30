//time complexity - O(N), space complexity - O(1)
//The solution uses a HashMap to store the mapping from characters in string s to corresponding characters in string t/
//It uses a HashSet to ensure that two characters from string s do not map to the same character in string t.
//The algorithm iterates through each character in the strings, checking the mapping conditions.
class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        HashSet<Character> set = new HashSet<>();
        if(s == null || t == null) return false;
        if(s.length() != t.length()) return false;
        if(s == null && t == null) return false;
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) != t.charAt(i)) return false;
            }
            else{
               if(set.contains(t.charAt(i))) return false;
               map.put(s.charAt(i), t.charAt(i));
               set.add(t.charAt(i));

            }

        } return true;
    }
}