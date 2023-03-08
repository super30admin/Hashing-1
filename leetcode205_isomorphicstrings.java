//Time complexity:O(n)
//Space Complexity: O(1)
//code executed on leetcode : yes 
// description : created 2 hashmaps to map character in both the strings if there is already a matching character which maps to a different character in map we stop the loop 

class Solution {
    public boolean isIsomorphic(String s, String t) {   
        if(s== null && t==null)return true;      
        if(s==null || t==null)
        return false;
        if(s.length()!=t.length())
        return false;
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> pmap = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char cs = s.charAt(i);
            char ps = t.charAt(i);
            if(!smap.containsKey(cs)){
                smap.put(cs,ps);
            }else{
                if(smap.get(cs)!=ps)
                return false;
            }
            if(!pmap.containsKey(ps)){
                pmap.put(ps,cs);
            }else{
                if(pmap.get(ps)!=cs)
                return false;

            
        }

         

     
        
    }
    return true;
}
}
