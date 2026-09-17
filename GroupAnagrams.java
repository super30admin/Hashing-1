//Time Complexity :O(N*K log K) where N -number of strings, K -avaerage length of string

// Space Complexity : O(N*K)-> In the worst-case scenario (where all strings are unique and share no anagrams), the map will N keys. Each key is a sorted representation of a string of length up to K, requiring O(K) space.

// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Edge case
        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> map = new HashMap();
        for (String str : strs) {// N comparisons
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);// k log k for sorting
            String sortedString = String.valueOf(charArray);

            if (!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(str);
        }
        return new ArrayList<>(map.values());

    }
}