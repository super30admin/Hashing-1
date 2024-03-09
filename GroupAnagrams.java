// Time Complexity : O(n k log k)
// Space Complexity : 0(n k)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach : Sort each string and, keep the sorted string as the key in hashmap, and add the 
//            original string as the value. Return the lists of values.

// Your code here along with comments explaining your approach
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();

        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

        for (int i = 0; i < strs.length; i++) {
            char[] str_arr = strs[i].toCharArray();
            Arrays.sort(str_arr);
            String str = new String(str_arr);

            ArrayList<String> list = new ArrayList<String>();

            if (map.containsKey(str)) {
                list = map.get(str);
            }
            list.add(strs[i]);
            map.put(str, list);
        }
        for (String s : map.keySet()) {
            res.add(map.get(s));
        }
        return res;
    }
}