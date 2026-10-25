class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] strChar = s.toCharArray();
            Arrays.sort(strChar);
            String sortedStr = String.valueOf(strChar);

            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(s);
        }

        return new ArrayList<>(map.values());
    }
}

// TC - O(n * k log k)
// SC - O (n * k)