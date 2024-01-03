// take one hashmap, and a set
// do the character mapping, add the entry to map , and set at the same time
// while map doesn't contains key, chec if set has the other mapping, if yes, return false. 
//     else just add those entries 
//tc: O(m+m) = O(m) length of bboth string
//sc: O(1) 

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) 
            return false;
        
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        
        for(int i=0; i< s.length(); i++)
        {
            char c = s.charAt(i);
            char p = t.charAt(i);
            
            if(!map.containsKey(c) && set.contains(p)) return false;
            if(map.containsKey(c) && map.get(c) != p) return false;
            
            map.put(c,p);
            set.add(p);
        }
        
        return true;
    }
}