// TC O(n)
// SC O(1)
//Using a map and a set. Map the chars of 2 strings if it not already mapped. Add the mapped char to the set
//so that it becomes easy to check whether already it has been mapped and if yes, it is not isomorphic.

class Solution {

    public boolean isIsomorphic(String s, String t) {

        Map<Character,Character> sToT= new HashMap<>();
        Set<Character> tSet= new HashSet<>();

        for(int i=0; i<s.length(); i++){
            char sChar= s.charAt(i);
            char tChar= t.charAt(i);
            if(sToT.containsKey(sChar)){
                if(sToT.get(sChar)!=tChar){
                    return false;
                }
            }else{
                if(tSet.contains(tChar)){
                    return false;
                }
                sToT.put(sChar,tChar);
                tSet.add(tChar);
            }
        }
        return true;
    }
}