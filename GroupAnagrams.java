// Time Complexity : O(n * k log k)
// Space Complexity : O(n * k)
// Did this code successfully run on Leetcode : Yes

// Sort each string to generate a canonical key for all its anagrams.
// Group strings with the same sorted key using a hash map.
// Return all grouped anagram lists from the map.

class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupedAnagrams = new HashMap<String, List<String>>();

        for(String str : strs) {
            char[] sortedChars = str.toCharArray();
            Arrays.sort(sortedChars);

            String sortedStr = new String(sortedChars);

            List<String> group = null;
            if(groupedAnagrams.containsKey(sortedStr)) {
                group = groupedAnagrams.get(sortedStr);
            } else {
                group = new ArrayList<String>();
            }
            group.add(str);
            groupedAnagrams.put(sortedStr, group);
        }

        List<List<String>> result = new ArrayList<List<String>>();
        for(Map.Entry<String, List<String>> entry : groupedAnagrams.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }
}