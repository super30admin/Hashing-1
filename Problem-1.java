//Time Complexity : O(n k logk);
// Space complexity : O(n*k);
// Did you face any issues: No
// Solved on leetcode : Yes
// We are soting each element in the String, and iterating over the strings and adding into the list for the similar anagrams
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> result = new HashMap<>();
        for(String a:strs) { // n
            char charArray[] = a.toCharArray();
            Arrays.sort(charArray); //(k logk)
            String key = new String(charArray);
            if(!result.containsKey(key)) {
                result.put(key, new ArrayList<>());
            }
            result.get(key).add(a);
        }
        return new ArrayList<>(result.values());
    }
}
