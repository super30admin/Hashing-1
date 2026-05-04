// Time Complexity : O(n) where n is the total number of characters/total number of words (whatever is greater)
// Space Complexity : O(n * k) where n is the total number of words and k is the average length of the words
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


public class Solution
{
    public bool WordPattern(string pattern, string s)
    {
        Dictionary<char, string> dictionary = new();
        HashSet<string> stringSet = new();
        string[] stringArray = s.Split(' ');

        if (pattern.Length != stringArray.Length)
        {
            return false;
        }

        for (int i = 0; i < pattern.Length; i++)
        {
            char ch = pattern[i];

            if (!dictionary.ContainsKey(ch))
            {
                if (stringSet.Contains(stringArray[i]))
                {
                    return false;
                }

                dictionary[ch] = stringArray[i];
                stringSet.Add(stringArray[i]);
            }

            else
            {
                if (dictionary[ch] != stringArray[i])
                {
                    return false;
                }

            }
        }

        return true;
    }
}