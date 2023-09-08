class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] arrStr = s.split(" ");
        if (pattern.length() != arrStr.length) {
            return false;
        }
        HashMap<Character, String> pmap= new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<pattern.length(); i++){
            char c= pattern.charAt(i);
            String str= arrStr[i];
           if (!pmap.containsKey(c)) {
                if (set.contains(str)) {
                    return false;
                }
                pmap.put(c, str);
                set.add(str);
            } else {
                if (!pmap.get(c).equals(str)) {
                    return false;
                }
            }
