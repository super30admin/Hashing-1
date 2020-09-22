// Time Complexity : O(n*k^2) for each string(n), sort all its chars(k)
// Space Complexity : O (nk) where n is #strings and k is max length of string 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : was stuck on finding a better hash, was trying to use set()


// Your code here along with comments explaining your approach
// The idea is to create a hash function which would create the same value for the strings irrespective of order
// first idea was to use a set() but then that would remove duplicate char's, hence only option was to sort chars in string first and then use that as hash

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> map = new HashMap<String, List>();
        
        for (String s : strs){
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
}