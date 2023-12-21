// Time Complexity : O(n) where n is the length of a string s and t.
// Space Complexity : O(n) for Hashmap and HashSet
// Method : Hashing

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int l1 = s.length(), l2 = t.length();

        if(l1 != l2) return false;

        HashMap<Character, Character> map = new HashMap();
        HashSet<Character> set = new HashSet();

        int i = 0, j = 0;

        while(i < l1)
        {
            if(map.containsKey(s.charAt(i)))
            {
                if(map.get(s.charAt(i)) != t.charAt(j)) return false;
            }

            else if(set.contains(t.charAt(j))) return false;

            else
            {
                map.put(s.charAt(i), t.charAt(j));
                set.add(t.charAt(j));
            }

            i++;
            j++;
        }

        return true;
    }
}