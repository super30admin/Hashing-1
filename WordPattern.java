/*
* concept is similar to isomorphic strings, instead of string here we are doing word to pattern
*/

// TC: O(n) -> length of words or length of pattern
// SC: O(n) -> map and set to hold word to pattern and pattern to word mapping

class Solution {
    public boolean wordPattern(String pattern, String s) {
        // map for pattern to word mapping
        HashMap<Character, String> patternMap = new HashMap<>();

        // set to maintain mapped word
        HashSet<String> sSet = new HashSet<>();
        String str[] = s.split(" ");

        // case where length of the word array is not equal to pattern
        if(str.length != pattern.length())
            return false;
        
        // iterate over each pattern, see if it is mapped already, if mapped is it mapped with the same word, if not return false and if we have already seen the word (from set) that means it is mapped with some pattern so return false 
        for(int i = 0; i < pattern.length(); i++){
            char sChar = pattern.charAt(i);
            if(patternMap.containsKey(sChar)){
                String mappedString = patternMap.get(sChar);
                String word = str[i];
                if(mappedString.compareTo(word) != 0){
                    return false;
                }
            }
            else{
                if(sSet.contains(str[i])){
                    return false;
                }
                sSet.add(str[i]);
                patternMap.put(sChar, str[i]);
            }
        }
        return true;
    }
}
