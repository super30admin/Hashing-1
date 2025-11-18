/**
 * Group Anagrams
 * Sorted all the string and made it a hash key and original string as value
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Brute Force
        Map<String, List<String>> hm = new HashMap();

        for(String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sortedS = new String(c);
            hm.computeIfAbsent(sortedS, k -> new ArrayList<>()).add(s);

        }

    return new ArrayList<>(hm.values());


    }
}