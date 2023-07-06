//Time Complexity -> O(n) where n is length of string
//I will store each character of String one in a hashmap and the value will be
//character of another String.Along with that we will also store the characters
//Of String 2 in a hashset such that if any character is there in hashset it 
//means a different character is encountered. hence we will return false otherwise true.


class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null && t==null) return true;
        if(s==null && t!=null) return false;
        if(s!=null && t==null) return false;
        if(s.length()!=t.length()) return false;
         char[] sTemp = s.toCharArray();
         char[] tTemp = t.toCharArray();
         Map<Character,Character> map = new HashMap();
         Set<Character> hset = new HashSet();
         for(int i=0;i<sTemp.length;i++){
             if(map.containsKey(sTemp[i])){
                 if(map.get(sTemp[i])!=tTemp[i]) return false;  
             }else{
                 if(hset.contains(tTemp[i])) return false;
                 else{
                    map.put(sTemp[i],tTemp[i]);
                    hset.add(tTemp[i]);
                 }
             }
         }
         return true;
        
    }
}