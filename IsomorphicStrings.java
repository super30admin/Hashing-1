// Approach: Traverse through the characters of both strings and map them using a HashMap. Use HashSet to store the second char that can be checked to
// see if there are duplicate mappings to return false.

//Time Complexity: O(n)
//Space Complexity: O(n)

class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> tSet= new HashSet<>();

        if (t == null || t.length() == 0 || s == null || s.length() == 0 || s.length() != t.length()) return false;

        for(int i=0; i<s.length(); i++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar) return false;
            }
            else
            {
                if (tSet.contains(tChar)) return false;
                sMap.put(sChar, tChar);
                tSet.add(tChar);
            }
        }
        return true;
    }
}