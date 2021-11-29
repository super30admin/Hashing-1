//Given two strings s and t, determine if they are isomorphic

//Time complexity : O(n)
//space complexity : O(n)
public class problem2 {
  
        public boolean isIsomorphic(String s, String t) {
            Map<String,String> map  = new HashMap<>();   
            for(int i=0;i<s.length();i++){
                String s1 = String.valueOf(s.charAt(i));
                String s2 = String.valueOf(t.charAt(i));
                if(map.containsKey(s1)){
                    if(!map.get(s1).equals(s2)){
                        return false;
                    }
                }else if (map.containsValue(s2)){
                    if(!map.containsKey(s1)){
                             return false;
                    }
                }else{
                      map.put(s1,s2);
                }
    }
                 return true;
        }

    
}
