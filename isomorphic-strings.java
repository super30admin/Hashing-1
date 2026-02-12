// TimeComplexity: O(n)
// SpaceComplexity: O(1)
// Explnation : We first check if both strings have the same length. Then we use two HashMaps to maintain a one-to-one mapping between characters of s and t. While iterating, we verify that any existing mapping is consistent; otherwise, we return false. If all characters follow a valid bijection, we return true.
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        int m =  s.length();
        int n = t.length();
        if(m!=n) return false;
        for(int i=0; i<m; i++) {
            if(map1.containsKey(s.charAt(i))) {
                if(map1.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else{
                map1.put(s.charAt(i), t.charAt(i));
            }
            if(map2.containsKey(t.charAt(i))) {
                if(map2.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            } else{
                map2.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
        
    }
}