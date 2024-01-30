class Solution {
    public boolean wordPattern(String pattern, String s) {
    
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
        String []newString = s.split(" ");
        if(pattern.length() != newString.length) {
            return false;
        }
        if(pattern == null && newString == null) {
            return false;
        }
        for(int i=0; i< pattern.length();i++) {
            if(map1.containsKey(pattern.charAt(i))) {
                if(!(map1.get(pattern.charAt(i))).equals(newString[i])) {
                    return false;
                }
            } else {
                map1.put(pattern.charAt(i),newString[i]);
            }

            if(map2.containsKey(newString[i])) {
                if(!map2.get(newString[i]).equals(pattern.charAt(i))) {
                    return false;
                }
            } else {
                map2.put(newString[i],pattern.charAt(i));
            }
        }
        return true;
    }
}