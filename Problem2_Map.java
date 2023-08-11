// Time Complexity = O(N)
// Space Complexity = O(1)  
/*
Maintain two hashmaps to save the key value pair of the strings and compare if a given key is present with different value 
in the hashmap. If yes then the string is not isomporphic
*/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null && t==null){
            return true;
        }else if(s==null || t==null){
            return false;
        }
        HashMap<Character,Character> smap = new HashMap<>();
        HashMap<Character,Character> tmap = new HashMap<>();
        //
        for(int index =0;index<s.length();index++){
            Character key = s.charAt(index);
            Character value = t.charAt(index);
            if(!smap.containsKey(key)){
                smap.put(key,value);
            }else{
                if(smap.get(key)!=value){
                    return false;
                }
            }
        }

         for(int index =0;index<s.length();index++){
            Character key = t.charAt(index);
            Character value = s.charAt(index);
            if(!tmap.containsKey(key)){
                tmap.put(key,value);
            }else{
                if(tmap.get(key)!=value){
                    return false;
                }
            }
        }
        return true;
    }
}
