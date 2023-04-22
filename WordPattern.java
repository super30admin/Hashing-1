class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArray = s.split(" ");
        if(strArray.length != pattern.length()) {
            return false;
        } 
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < pattern.length(); i++) {
            char p = pattern.charAt(i);
            String word = strArray[i];
            if (map.containsKey(p)) {
              if (!map.get(p).equals(word)) {
                  return false;
              }
            }
            else {
                if (set.contains(word)) {
                    return false;
                }                
                set.add(word);
                map.put(p, word);
            }
        }
        return true;
    }
}