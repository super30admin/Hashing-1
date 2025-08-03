/** Time Complexity: O(N) where N is the length of the pattern.
 * Space Complexity: O(1) since the size of the character arrays is constant (256).
 * Did this code successfully run on Leetcode? Yes
 * Any problems faced? No
 */

/**
 * This function checks if a given pattern matches a string s.
 * It uses a HashMap to store the mapping from characters in the pattern to words in the string.
 * It also uses a HashSet to keep track of words that have already been mapped to ensure one-to-one mapping. It can use the same approach for the isomorphic strings too.
 */
import java.util.HashMap;
import java.util.HashSet;   
class wordPattern {
    public boolean wordPattern(String pattern, String s) {
        if(pattern.length()!=s.split(" ").length) return false;
        if(pattern.length()==0 || s.length()==0) return false;
        HashMap<Character,String> patternmap=new HashMap<>();
        HashSet<String> stringmapped=new HashSet<>();

        int len=pattern.length();      
        for (int i=0;i<len;i++)
        {
            char ch=pattern.charAt(i);

            if(patternmap.containsKey(ch))
            {
                if(patternmap.get(ch).equals(s.split(" ")[i]))
                {
                    continue; 
                }
                else return false;
            }
            else
            {
                String str=s.split(" ")[i];
                if (stringmapped.contains(str))
                { 
                    return false;
                }
                else 
                {
                    patternmap.put(ch,str);
                    stringmapped.add(str);
                }
            }
        }
        return true;

                    
        
    }
}