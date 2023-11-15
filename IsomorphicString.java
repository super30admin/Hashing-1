// Time Complexity: O(n)
// Space Complexity: O(1)

public class IsomorphicString {

    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null || s.length() != t.length()) throw new IllegalArgumentException();

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            var sChar = s.charAt(i);
            var tChar = t.charAt(i);

            if(!map.containsKey(sChar)){
                if(set.contains(tChar)) return false;
                map.put(sChar, tChar);
                set.add(tChar);
            }
            else{
                if(!(map.get(sChar)==tChar)) return false;
            }
        }
        return true;

    }
}
