// Time Complexity : Time complexity would be O(nklog(k))
// Space Complexity : Space complexity would be O(n) 
// Did this code successfully run on Leetcode :Yes

// Any problem you faced while coding this :
// Had to lookup how to convert string to char array, function to sort char array
// Had to lookup how to convert char array to string and various hashmap functions
// Could not figure out result.addAll(map.values());

// Your code here along with comments explaining your approach
// I am using hashmap where I am getting the key by sorting the strings. After I sort the individual strings by converting to char array, for all the anagrams I will get the same sorted keys. In values, I am storing List of strings. At the end I convert values into a list of list of strings

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String string = new String(c);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList<>());
            }
            map.get(string).add(strs[i]);

        }
        result.addAll(map.values());
        return result;

    }
}