// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

//Approach: Using dictionary to map each char of string 's' to corresponding char of string 't'.
//check the dictionary to find mapping for a char. If it exists check the mapped char and the iterating
//char are same, if they are different then the strings are not isomorphic.
public class Solution {
    public bool IsIsomorphic(string s, string t) {
        if(s == null || t == null || s.Length != t.Length) return false;

        HashSet<char> mappedChars = new HashSet<char>();
        Dictionary<char, char> hashMap = new Dictionary<char, char>();
        var sArray = s.ToCharArray();
        var tArray = t.ToCharArray();
        for(int i = 0; i < sArray.Length; i++) {
            if(hashMap.TryGetValue(sArray[i], out var value)) {
                if(value != tArray[i])
                {
                    return false;
                }
            }
            else {
                if(mappedChars.Contains(tArray[i])) {
                    return false;
                }
                else {
                    hashMap.Add(sArray[i], tArray[i]);
                    mappedChars.Add(tArray[i]);
                }
            }
        }
    return true;
    }
}
