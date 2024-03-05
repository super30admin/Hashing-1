//Time complexity: O(n)
//Space Complexity : O(s) - size of letters to be stored
/*Approach: Create a Hashmap to store the chars as keys from pattern string. We need a Hashset to store the values (the words), let's call it tSet
  for each char in pattern, see if it has an entry in sMap, if yes, it's value should be equal to sub string in s at that index.
  if no, we create an entry for it with key as schar and value as sub_str[i]. 
  we also add the sub_string to the tSet. we then check if the new sub_str is already there in the tSet, in that case we return false
  else we add it to the Map and set respectively 
*/

import java.util.HashMap;
import java.util.HashSet;
public class WordPattern{
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> sMap = new HashMap<>();
        HashSet<String> tSet = new HashSet<>();
        String[] sub_str = s.split(" ");

        if (pattern.length() != sub_str.length) return false;

        for(int i = 0; i< pattern.length(); i++){
            char p = pattern.charAt(i); 
            if(sMap.containsKey(p)){
                if(!sub_str[i].equals(sMap.get(p))){ return false;}
            }else{
                if(tSet.contains(sub_str[i])){ return false;}
                else{
                    sMap.put(p,sub_str[i]);
                    tSet.add(sub_str[i]);
                }
            }
    }
    return true;
}
} 
