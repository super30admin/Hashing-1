import java.util.HashMap;
import java.util.HashSet;
// in This Pattern problem you first split the string s into array of words and then map it with the corresponding char and check if the pattern breaks. We use the set to see if the reverse order case is also accounted for.
// TC is O(n) and SC is O(n)
public class problem3 {
    public boolean wordPattern(String pattern, String s){
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;
        HashMap<Character, String> pMap = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < pattern.length(); i++){
            char pChar = pattern.charAt(i);
            String word = words[i];
            if(pMap.containsKey(pChar)){
                if(!pMap.get(pChar).equals(word))
                    return false;
            }else{
                if(set.contains(word)) return false;
                pMap.put(pChar, word);
                set.add(word);
            }
        }
        return true;
    }
}
