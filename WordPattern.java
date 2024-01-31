class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(pattern == null && s == null) return true;
        if (pattern == null || s == null) return false;

        String[] arr = s.split(" ");

        if (arr.length != pattern.length()) return false;
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String str = arr[i];

            if(!map.containsKey(c)) {
                if (!set.contains(str)) {
                    map.put(c, str);
                    set.add(str);
                }else {
                    return false;
                }
            } else {
                if (!str.equals(map.get(c))) return false;
            }

        }
        return true;

    }
}