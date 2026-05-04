// Time Complexity : O(n) where n is the total number of characters
// Space Complexity : O(n) where n is the total number of characters
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


public class Solution
{
    public bool IsIsomorphic(string s, string t)
    {
        Dictionary<char, char> sMap = new();
        HashSet<char> tSet = new();

        for (int i = 0; i < s.Length; i++)
        {
            char sChar = s[i];
            char tChar = t[i];

            if (sMap.ContainsKey(sChar))
            {
                if (sMap[sChar] != tChar)
                {
                    return false;
                }
            }

            else
            {
                if (tSet.Contains(tChar))
                {
                    return false;
                }

                sMap[sChar] = tChar;
                tSet.Add(tChar);
            }

        }

        return true;
    }
}