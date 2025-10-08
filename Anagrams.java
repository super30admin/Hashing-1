// Time Complexity : O(log n).
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Approach : Two strings are anagrams, if they have the same letters used and with same frequency. The approach here is to build a frequency array for each
// string with a
// specific pattern seperated by #, so that it will be same for another anagram word. When ever, we see the same pattern we add it to the HashMap and finally
// retrive the values of the hashmap.

// Your code here along with comments explaining your approach


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map= new HashMap<>();

        for(String s : strs){
            int[] chars = new int[26];
            for(int i=0;i<s.length();i++){
                chars[s.charAt(i) - 'a']++;// frequency count array
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<26;i++){
                sb.append("#"); //to differentiate each one.
                sb.append(chars[i]);
            }

            String key = sb.toString();

            map.computeIfAbsent(key, k-> new ArrayList<>()).add(s);



        }
        return new ArrayList<>(map.values());

    }
}