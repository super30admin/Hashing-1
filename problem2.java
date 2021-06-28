class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> first = new HashMap<>();
        HashMap<Character, Character> second = new HashMap<>();
        
        if(s.length() < t.length())
            return false;
        
        for(int i=0; i<s.length(); i++){
            
            if(first.containsKey(s.charAt(i)) && first.get(s.charAt(i)) != t.charAt(i))
                return false;
            
            if(second.containsKey(t.charAt(i)) && second.get(t.charAt(i)) != s.charAt(i))
                return false;
            
            first.put(s.charAt(i), t.charAt(i));
            second.put(t.charAt(i), s.charAt(i));
        }
        
        return true;
    }
}