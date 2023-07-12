
// Time: O(n) +O(n) = O(n)
// Space: O(number of valid ascii chars) O(1)


class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        for(int i = 0 ; i< s.length() ; i++){
            if(map.containsKey(s.charAt(i))){
                char expectedChar = map.get(s.charAt(i));
                if(expectedChar!= t.charAt(i)){
                    return false;
                }
            }else{
                map.put(s.charAt(i), t.charAt(i));
            }
        }

        Map<Character,Character> t_map = new HashMap<>();
        for(int i = 0 ; i< s.length() ; i++){
            if(t_map.containsKey(t.charAt(i))){
                char expectedChar = t_map.get(t.charAt(i));
                if(expectedChar!= s.charAt(i)){
                    return false;
                }
            }else{
                t_map.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}