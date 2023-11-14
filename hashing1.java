//TC - O(n)
//SC - O(1)

class Solution {

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        if((s == null) || (t == null)) return false;
        if(s.length() != t.length()) return false;

        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                if(set.contains(t.charAt(i))) {return false;}
                else{
                    map.put(s.charAt(i),t.charAt(i));
                }
            }else{
                if(!map.get(s.charAt(i)).equals(t.charAt(i))) return false;
            }
            set.add(t.charAt(i));
        }
        return true;
    }

}

