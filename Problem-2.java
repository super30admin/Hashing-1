//TC=O(n)
//SC=O(1)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);

            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar)!=tChar){
                    return false;
                }
            }

            else{
                if(set.contains(tChar)){
                    return false;
                }
                set.add(tChar);
                sMap.put(sChar,tChar);
            }
        }
        return true;
    }
}