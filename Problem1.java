// Time Complexity :O(N * K) where N is the number of strings and K is the maximum length of a string
// Space Complexity: O(N * K)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
//Approach
// Create a hashmap with key as sorted string, and value as a list of strings
// if we encounter sorted string that is present as a key in hashmap, we appand the value as the incoming stings in list
// at the end we return the list

//Another approach
// instead of sorting the list, we create a int arary as key is the key is present
//we add the corresponding string in HashMap
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String s: strs){
            int[] count = new int[26];
            for(int i =0; i<s.length(); i++){
                count[s.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(count);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}