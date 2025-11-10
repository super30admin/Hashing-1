// The solution implements a HashMap and HashSetto check if a string follows a given pattern.
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArray = s.split(" ");
        if(pattern.length() != strArray.length) {
            return false;
        }
        HashMap<Character, String> patternMap = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<pattern.length(); i++) {
            Character c = pattern.charAt(i);
            String str = strArray[i];
            if(patternMap.containsKey(c)) {
                if(!str.equals(patternMap.get(c))) {
                    return false;
                }
            }
            else {
                    patternMap.put(c, str);
                    if(set.contains(str)) {
                        return false;
                    }
                    set.add(str);
                }
        }
        return true; 
    }
}