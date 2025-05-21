// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : No

class Problem1 {
    public List<List<String>> groupAnagrams(String[] strs) {

            Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);

            if (!map.containsKey(key)) {
               map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);

        }
        return new ArrayList<>(map.values());
    }
}