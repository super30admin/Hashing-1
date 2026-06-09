// Time complexity is O(n^2.m)
// Space complexity is O(n · m)
// convert the convert the pattern in to char array, and string in to string Array
// check if length of pattern and string is equal if not return false
// The idea is the check if character at index i of pattern present in hashmap .
// if present every time it appears it should be mapped to the same word in the string at that index
// vice versa .
class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        char[]  chars = pattern.toCharArray();
        String[] words = s.split(" ");
        if(chars.length != words.length) return false;
        HashMap<Character, String> patternMap = new HashMap<>();
        for(int i= 0; i < chars.length; i++) {
            if (patternMap.containsKey(chars[i])) {
                if(!patternMap.get(chars[i]).equals(words[i])) {
                    return false;
                }
            } else {
                if (patternMap.values().contains(words[i])){
                    return false;
                }
                patternMap.put(chars[i], words[i]);
            }
        }
        return true;
    }
}