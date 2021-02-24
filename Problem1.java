//Problem 1:
//Given an array of strings, group anagrams together.

//Example:
//Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
//Output:
//[
//  ["ate","eat","tea"],
//  ["nat","tan"],
//  ["bat"]
//]

//Note:
//All inputs will be in lowercase.
//The order of your output does not matter.


//Time Complexity: O(NKlogK), where N is the length of strs, and K is the maximum length of a string in strs.
//The outer loop has complexity O(N) as we iterate through each string. Then, we sort each string in O(KlogK) time.

//Space Complexity: O(NK), the total information content stored in ans.


import java.io.*;

class Problem1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}