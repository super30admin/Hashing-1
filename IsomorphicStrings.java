// Time Complexity : O(n); n = length of strings
// Space Complexity : O(n); hashmap and hashset
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();

        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            char sch = s.charAt(i);
            char tch = t.charAt(i);

            if (!map.containsKey(sch)) {
                map.put(sch, tch);
            }
            else {
                if (map.get(sch) != tch) return false;
            }
        }

        HashSet<Character> set = new HashSet<>();
        for (char c : map.values()) {
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }

        return true;

    }
}