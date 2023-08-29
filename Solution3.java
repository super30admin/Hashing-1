// Leetcode problem : https://leetcode.com/problems/word-pattern/
// Time Complexity : O(n) where n is the total length of pattern or total number of words in s
// Space Complexity : O(k) where k is the total number of unique words in s 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
/*
I split s into an array of strings. I check if the size of array is same as length of pattern, if not I return false. I use a HashMap
and Set - the map is used to map the alphabets with strings and set is used to check if the same occurence of string is already present.
 */
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String []arrayOfStrings = s.split(" ");
        if(pattern.length()!=arrayOfStrings.length)
        {
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<pattern.length();i++)
        {
            if(map.containsKey(pattern.charAt(i)))
            {
                if(!map.get(pattern.charAt(i)).equals(arrayOfStrings[i]))
                {
                    return false;
                }
            }
            else
            {
                if(set.contains(arrayOfStrings[i]))
                {
                    return false;
                }
                map.put(pattern.charAt(i),arrayOfStrings[i]);
                set.add(arrayOfStrings[i]);
            }
        }
        return true;
    }
}