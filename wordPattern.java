class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");

        HashMap<String, Character> strMap = new HashMap<>();
        HashMap<Character,String> charMap = new HashMap<>();

        if (arr.length != pattern.length()){
            return false;
        }

        for (int i=0; i<pattern.length(); i++){
            char ca = pattern.charAt(i);
            String str = arr[i];
            if (!strMap.containsKey(str)) {
                strMap.put(str, ca);
            } else {
                if (!strMap.get(str).equals(ca)) {
                    return false;
                }
            }
            if (!charMap.containsKey(ca)) {
                charMap.put(ca, str);
            } else {
                if (!charMap.get(ca).equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }
}