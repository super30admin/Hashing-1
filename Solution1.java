// Time Complexity : O(m * nlogn) where m is the number of strings
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
/* I have created a map that stores a string and a list of strings as key-value pairs. I iterate through each string and convert it into a character array and then sort it. This character array is 
 * then converted back into a string and I check if the sorted string is present as a key in map, if not I add the key to the map along with an empty list of strings. Then I subsequently add the
 * original string string to the list of strings.
 */


class Solution1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            char []c = s.toCharArray();
            Arrays.sort(c);
            String temp = String.valueOf(c);
            if(!map.containsKey(temp))
            {
                map.put(temp,new ArrayList<String>());
            }
            map.get(temp).add(s);
        }

        return new ArrayList<>(map.values());
    }
}