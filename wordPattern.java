//TC is O(n) with n as the length of string pattern
//SC is O(n) with 2 hashmaps combined with n being the length of strings
class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> sMap = new HashMap<>();
        String[] words = s.split("\\s+");
        if(pattern.length() != words.length)
            return false;
        for(int i = 0 ; i < pattern.length() ; i++) {
            char ch = pattern.charAt(i);
            String word = words[i];
            if(map.containsKey(ch)) {
                if(!map.get(ch).equals(word)) {
                    System.out.println("map's word " +map.get(ch));
                    return false;
                }
            }
            else
                map.put(ch, word);
            if(sMap.containsKey(word)) {
                if(!sMap.get(word).equals(ch))
                    return false;
            }
            else
                sMap.put(word, ch);
        }
        return true;
    }
}