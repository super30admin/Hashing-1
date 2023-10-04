class Solution {
    public boolean isIsomorphic(String s, String t) {
       HashMap<Character,Character>smap = new HashMap<>();
       HashSet<Character>tmap = new HashSet<>();
       for(int i = 0; i < s.length(); i++){
           char c = s.charAt(i);
           char d = t.charAt(i);
           if(!smap.containsKey(c)){
               if(tmap.contains(d))
                return false;
                smap.put(c,d);
                tmap.add(d);
           }
           else{
               if(smap.get(c)!=d)
                return false;
           }
       }
       return true;

    }
}