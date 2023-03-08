//Time Complexity:O(nk)
//Space Complexity:O(1)
//Executed on leetcode : yes 
//description: created 2 hashmaps 1 for words and one for characters 

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> smap = new HashMap<>();
        HashMap<String, Character> pmap = new HashMap<>();


        String[] pwords = s.split(" ");
        //System.out.println(pwords);

        if(pattern.length()!= pwords.length)
        return false;

        
       for(int i=0;i<pattern.length();i++){
            char cs = pattern.charAt(i);
           String str = pwords[i]; 
            if(!smap.containsKey(cs)){
              if(pmap.containsKey(str))
              return false;
            else{
               smap.put(cs,str);
               pmap.put(str, cs);
            }
            }else {
                String word = smap.get(cs);
                if(!word.equals(str))
                return false ;
            }
            

            
        }

         

     return true;
        
    } 
       


        
    }
