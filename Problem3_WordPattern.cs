// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

//Approach: Using dictionary to map each char of string 's' to corresponding char of string 't'.
//check the dictionary to find mapping for a char. If it exists check the mapped char and the iterating
//char are same, if they are different then the strings are not isomorphic.
public class Solution {
    public bool WordPattern(string pattern, string s) {
        if(pattern == null || s == null) return false;
        
        var patternChars = pattern.ToCharArray();
        string[] words = s.Split(' ');
        if(patternChars.Length != words.Length) return false;

        HashSet<string> mappedWords = new HashSet<string>();
        Dictionary<char, string> hashMap = new Dictionary<char, string>();

        for(int i = 0; i < patternChars.Length; i++) {
            if(hashMap.TryGetValue(patternChars[i], out var value)) {
                if(value != words[i])
                {
                    return false;
                }
            }
            else {
                if(mappedWords.Contains(words[i])) {
                    return false;
                }
                else {
                    hashMap.Add(patternChars[i], words[i]);
                    mappedWords.Add(words[i]);
                }
            }
        }
    return true;
    }
}
