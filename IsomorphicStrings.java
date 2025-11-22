// Time Complexity: O(n) -> where n is the number of characters in the string
// Space Complexity: O(1) -> O(constant)

// 1: 2 Hashmaps are being used to store the mapping from one string to another
// 2: For any new character, we add the mapping and for existing character, we check to see that the character matches the one in the other string
// 3: If both hashmaps are created without error, we can say that both strings are isomorphic
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int slength = s.length();
        int tlength = t.length();

        if(slength != tlength) return false;

        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for(int i = 0; i<slength; i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar) return false;
            }
            else{
                sMap.put(sChar, tChar);
            }

            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar) != sChar) return false;
            }
            else{
                tMap.put(tChar, sChar);
            }
        }
        return true;
    }
}