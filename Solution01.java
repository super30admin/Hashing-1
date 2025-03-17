import java.util.*;

class Solution01 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs== null|| strs.length==0) return new ArrayList<>();
        Map<String, List<String>> anagrams = new HashMap();
        for(String s:strs){
            char [] charArr= s.toCharArray();
            Arrays.sort(charArr);
            String sorted = String.valueOf(charArr);
            if(!anagrams.containsKey(sorted)){
                anagrams.put(sorted,new ArrayList<>());
            }
            anagrams.get(sorted).add(s);
        }
        return new ArrayList<>(anagrams.values());
    }
}