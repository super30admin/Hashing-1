// Time complexity - O(nklogk) where n is the numbers of elements in input and k is the avg length of each string. Since we need to sort

// Space complexity - O(nk)

// Approach - we basically iterate through each string. Sort the string. Add it to the hashmap if it does not exist and we keep adding anagrams to list

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        
        HashMap<String,List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sortedString = String.valueOf(arr);
            if (!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<String>());
            }
            map.get(sortedString).add(s);
        }
        return new ArrayList<>(map.values());
    }
}