class Solution {
    // I use two hashmaps to maintain one-to-one mapping between characters s and t 
    //for each index, i chek whether an existing mapping conflicts in either direction,if it does, return false
    //If I finish loop without conflicts, the string are isomorphic, return true
    
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> STmap = new HashMap<>();
        HashMap<Character, Character> TSmap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(STmap.containsKey(c1) && STmap.get(c1) != c2)
            return false;
            if(TSmap.containsKey(c2) && TSmap.get(c2) != c1)
            return false;
            STmap.put(c1, c2);
            TSmap.put(c2,c1);

        }   
                 return true;

         }
}
