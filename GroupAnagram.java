// Time Complexity : NKlog(K) where N is length of input string and K is max length of a input string
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class GroupAnagram
{
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs)
        {
            HashMap<String, List<String>> map = new HashMap();
            for(String inputStr : strs)
            {
                char[] inputStrChar = inputStr.toCharArray();
                Arrays.sort(inputStrChar);
                String sortedInputStr = new String(inputStrChar);

                if(!map.containsKey(sortedInputStr))
                    map.put(sortedInputStr, new ArrayList<String>());

                map.get(sortedInputStr).add(inputStr);
            }
            return new ArrayList<>(map.values());
        }
    }
}
