// Time Complexity :o(n)
// Space Complexity :o(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
/*
Sorted each string 
Created a new Map and added sorted string if map doesn't contains the sorted string
Added string as value to respcted sorted key. 
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        int n = strs.length;
        for (int i = 0; i < n; i++) {
            char[] arr = strs[i].toCharArray();
            java.util.Arrays.sort(arr);
            String k = new String(arr);
            if (!(map.containsKey(k))) {
                map.put(k, new ArrayList<String>());
            }
            map.get(k).add(strs[i]);

        }
        List<List<String>> list = new ArrayList<>(map.values());

        return list;
    }
}