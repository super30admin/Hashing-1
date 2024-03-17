//Time Complexity:O(N)
//Space Complexity:O(1)
//Code solved in leetcode: Yes
//Approach in 3 lines:

// 1. Split the given string `s` into individual words and ensure it matches the length of the pattern.
// 2. Map each character in the pattern to its corresponding word in `s`, ensuring consistent mappings and no repetition of words.
// 3. If all mappings are valid, return true; otherwise, return false.

public class Solution {
    public bool WordPattern(string pattern, string s) {
        Dictionary<char, string> result = new Dictionary<char, string>();
        var words = s.Split(' ');

        if(pattern.Length != words.Length)
        {
            return false;
        }
        for(int i=0; i<pattern.Length; i++)
        {
            if(result.TryGetValue(pattern[i], out var currentword))
            {
                if(currentword != words[i])
                {
                     return false;
                }
                continue;
            }
            if(result.ContainsValue(words[i]))
            {
                return false;
            }
            result.Add(pattern[i],words[i]);
        }
        return true;
    }
}