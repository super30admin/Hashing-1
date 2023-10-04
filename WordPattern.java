// Time Complexity : O(N) where N is the length of input string.
// Space Complexity : O(1) since just store alphabets in the Maps & in sets max numbers of elements would be 26.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class WordPattern
{
    public boolean wordPattern(String pattern, String s)
    {
        HashMap<Character, String> map = new HashMap();
        HashSet<String> set = new HashSet();

        String[] inputString = s.split(" ");
        if(inputString.length != pattern.length())
            return false;

        for(int i = 0; i < pattern.length(); i++ )
        {
            char c = pattern.charAt(i);
            if(!map.containsKey(c))
            {
                if(set.contains(inputString[i]))
                    return false;

                map.put(c, inputString[i]);
                set.add(inputString[i]);
            }
            else if(!map.get(c).equals(inputString[i]))
                    return false;
        }
        return true;
    }
}