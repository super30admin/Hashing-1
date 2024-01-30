import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Hashmap is used to store the S characters to T strings mapping
//hashset to track if T strings already mapped to a different char in S
//First check if char at i index of S is already mapped, 
//  if i index char not present in the map and the set doesn't have the i index T string, proceed to add entry in the map and add i index T string to set
//  if present and mapped to the expected char proceed to the next iteration
//  if none of these conditions are satisfied, it determines that duplicate char mapping has occurred so return false

public class Problem3_WordPattern {
    public boolean wordPattern(String pattern, String s) {
        char[] carr = pattern.toCharArray();
        String[] sarr = s.split(" ");
        Map<Character, String> cmap = new HashMap<>();
        Set<String> set = new HashSet<>();
        
        if(carr.length != sarr.length) return false;
        for(int i=0; i<carr.length; i++){
            String str = cmap.get(carr[i]);
            if((str==null && !set.contains(sarr[i])) || (str!=null && str.equals(sarr[i]))){
                cmap.put(carr[i], sarr[i]);
                set.add(sarr[i]);
            } else
                return false;
        }
        return true; 
    }
}