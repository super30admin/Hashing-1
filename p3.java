// Time Complexity : Time complexity would be O(n) as we have to traverse the string
// Space Complexity : Space complexity would be O(1) as there can be finite number of letters 
// Did this code successfully run on Leetcode :Yes

// Any problem you faced while coding this :
// Had to lookup String.split

// Your code here along with comments explaining your approach
// Using hashmap and hashset. Using hashmap to maintaing correlation between alphabets in string pattern and words in string s. Using hashset to find if there's any case of word getting repeared for different alphabet.

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sarray = s.split(" ");
        if (pattern.length() != sarray.length)
            return false;

        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char p = pattern.charAt(i);
            if (!map.containsKey(p)) {
                map.put(p, sarray[i]);
                if (set.contains(sarray[i]))
                    return false;
            }
            if (!map.get(p).equals(sarray[i]))
                return false;

            set.add(sarray[i]);
        }

        return true;
    }
}