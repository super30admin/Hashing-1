// O(n) time
// O(1) space
// Runs on leetcode
// No issues faced in coding

class Solution {

    HashMap<Character, Character> mappings = new HashMap<>();
    Set<Character> used = new HashSet<>();

    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(!mappings.containsKey(a)){
                if(!used.contains(b)){
                    mappings.put(a,b);
                    used.add(b);
                } else return false;
            } else if(mappings.get(a) != b) return false;
        }

        return true;
        
    }
}
