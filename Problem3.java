// Time Complexity : O(n) where n represents the number of words in the string s
// Space Complexity : O(m) where m is the number of unique characters in pattern and words in s.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No Problem faced

class Problem3 {
    public boolean wordPattern(String pattern, String s) {
        HashMap map_index = new HashMap();
        String[] words = s.split(" ");

        if (words.length != pattern.length())
            return false;

        for (Integer i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (!map_index.containsKey(c))
                map_index.put(c, i);

            if (!map_index.containsKey(w))
                map_index.put(w, i);

            if (map_index.get(c) != map_index.get(w))
                return false;
        }

        return true;
    }
}