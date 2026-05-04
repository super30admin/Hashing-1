// Time Complexity : O(k * nlogn) where k the length of input strs and n is the maximum length of the string
// Space Complexity : O(n * k)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/*
I have created a dictionary with sorted strings as the key and List<string> as the values that represent the anagrams of the sorted
strings. For each string, I sort it using the built-in Array.Sort method and store it in the dictionary as a key if it's not already
present.
*/

public class Solution
{
    public IList<IList<string>> GroupAnagrams(string[] strs)
    {
        Dictionary<string, List<string>> dict = new();
        foreach (string str in strs)
        {
            char[] charArray = str.ToCharArray();
            Array.Sort(charArray);
            String sortedStr = new String(charArray);

            if (!dict.ContainsKey(sortedStr))
            {
                dict[sortedStr] = new List<string>();
            }

            dict[sortedStr].Add(str);
        }

        return dict.Values.ToList<IList<string>>();
    }
}