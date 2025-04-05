class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        
        /*
        Thought Process:
        
        We need to check if character matching is present. So hashing techinque can be more suitable
        
        Can do it with 2 hashmaps or 1 hm & 1 hashset.
        Which to choose?
        2 HashMaps -> More size? The hashmap size will be maximum 26 and size of each of its element is just a character
        So both of the solutions does not have much SC difference.
        
        Looping through the strings
        First -> Happy Path. When to insert in both map and set? when sChar is not present in map and tChar is not present in set.
        Next -> When to continue? When sChar is present and it's value matches to tChar
        Rest everything unhappy case. Return false
        
        Mistakes: 1. Wrote map.getValue() which should be map.get()
                  2. Not writing sChar and tChar, instead fetching s.charAt(i) everywhere. Avoid it to reduce code time and improve code writing speed
                  
        TC: O(N) : Since looping once throught the string
        SC: O(26) = O(1) Constant as the size of HashMap or HashSet won't be greater than 26 (alphabets)
        
        */
        
        //Edge Case
        if(s.length() != t.length()) return false;
        
        HashMap<Character, Character> m = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0; i<s.length(); i++){
            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);
            
            if(!m.containsKey(sChar) && !set.contains(tChar)){
                m.put(sChar, tChar);
                set.add(tChar);
            }
            else{
                if(m.containsKey(sChar) && m.get(sChar)==tChar) {
                    continue;
                }
                else return false;
            }
        }
        return true;
    }
}