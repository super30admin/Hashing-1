// 290. Word Pattern
// Time Complexity : O(n)
// Space Complexity : O(m+n)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

/* 
    iterating through each word in s, associating each unique word with its corresponding character in pattern. 
    If the association is different to previous mappings, it returns false. Finally, all characters in 
    pattern are mapped and returns true if so, false otherwise.
*/

// Your code here along with comments explaining your approach
bool wordPattern(string pattern, string s) {
    string str = "";
    unordered_map<string, char> umap;
    unordered_map<char, string> imap;
    int j = 0;
    for(int i = 0; i <= s.size(); i++)
    {
        if(i == s.size() || s[i] == ' ')
        {
            if(umap.find(str) != umap.end())
            {
                if(umap[str] != pattern[j])
                    return false;
            }
            else if(imap.find(pattern[j]) != imap.end())
            {
                if(imap[pattern[j]] != str)
                    return false;
            }
            else
            {
                umap[str] = pattern[j];
                imap[pattern[j]] = str;
            }
            str = "";
            j++;
        }
        else
            str += s[i];
    }
    if(j<pattern.size())
        return false;
    return true;
}

