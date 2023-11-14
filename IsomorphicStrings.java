// Time Complexity: O(n)
// Space Complexity: O(1) as it will have on 26 character

class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;

        char map[] = new char[256];
        char set[] = new char[256];
        // Map<Character, Character> map = new HashMap<>();
        // Set<Character> set = new HashSet<>();

        for(int i=0; i< s.length(); i++){

            char sc = s.charAt(i);
            char tc = t.charAt(i);

            // Start of ASCII character is ' '
            if(map[sc - ' '] != 0){
                if(map[sc - ' '] != tc) return false;
            }else if(set[tc - ' '] != 0 ) {
                return false;
            }
            else{
                map[sc - ' '] = tc;
                set[tc - ' '] = tc;
            }

            // if(map.containsKey(sc)){
            //     if(map.get(sc) != tc) return false;
            // }
            // else if(set.contains(tc)) return false;
            // else{
            //     map.put(sc, tc);
            //     set.add(tc);
            // }
        }
        return true;
        
    }
}