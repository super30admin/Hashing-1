// Time Complexity: O(n)
// Space Complexity: O(256) = O(1) as s and t only contain ascii characters

// Approach - we need two conditions to be met, all occurences of a char must be replaced with another char and no two characters may map to same char. So basically for a string to be isomorphic, we need to be able to convert egg to add and also be able to convert the reverse, that is add to egg. Else it will not be isomorphic. Take the example of bar and foo. If bar was our first string and foo was our second string, if we only had one hashmap, it would return true. But it should be false. Hence, we need to maintain a two way mapping. One hashmap for s -> t and one hashmap for t -> s.

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> smap = new HashMap<>();
        HashMap<Character,Character> tmap = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if (!smap.containsKey(schar)) {
                smap.put(schar, tchar);
            }
            else {
                if (smap.get(schar) != tchar) {
                    return false;
                }
            }
            
            if (!tmap.containsKey(tchar)) {
                tmap.put(tchar, schar);
            }
            else {
                if (tmap.get(tchar) != schar) {
                    return false;
                }
            }
        }
        
        return true;
    }
}