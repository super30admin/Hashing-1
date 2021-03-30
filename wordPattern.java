// Time Complexity :O(N)
// Space Complexity :O(M)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

// Your code here  with comments explaining your approach

public class wordPattern {
    public boolean wordPattern(String pattern, String s) {
        // Create a hashmap with object as datatype
        HashMap hmap = new HashMap();
        String[] words = s.split(" ");
        // If both length are not equal return false
        if (words.length != pattern.length())
            return false;
        for (Integer i = 0; i < words.length; i++) {
            char curr = pattern.charAt(i);
            String str = words[i];
            // Check and add first letter in pattern along with its index
            if (!hmap.containsKey(curr))
                hmap.put(curr, i);
            // Check and add first word in string s along with its index
            if (!hmap.containsKey(str))
                hmap.put(str, i);
            // if both index are not equal return false
            if (hmap.get(curr) != hmap.get(str))
                return false;
        }
        return true;
    }

}
