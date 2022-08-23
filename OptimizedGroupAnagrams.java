// Time complexity - O(nk) where n is the numbers of elements in input and k is the avg length of each string
// Space complexity - O(nk)

// Optimized Approach - maintain a count array of 26 chars as we have only lower case chars. Increment count at each index whenever we see a char. Then create a string out of the int array by using a string builder. Add # after every count. Then store this count string as the key of the hashmap, so whenever there is an anagram, it will get added in the list for this key as the count of chars will be the same

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        
        HashMap<String,List<String>> map = new HashMap<>();
        int[] count = new int[26];
        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) count[c - 'a']++;
            StringBuilder sb = new StringBuilder();
            for (int c : count) {
                sb.append(c);
                sb.append("#");
            }
            String key = sb.toString();
            if (!map.containsKey(key)) map.put(key, new ArrayList<String>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}