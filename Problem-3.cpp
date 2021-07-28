//Time Complexity = O(N)
//Space Complexity = O(N)
//Where the N is the number of strings after splitting in s.

class Solution {
public:
    bool wordPattern(string pattern, string s) {
    vector<string> str;
    string x;  
    char token = ' ';
    stringstream ss(s);
    while (getline(ss, x, token)) {
        str.push_back(x);
    }
    if(pattern.length()!=str.size())
        return false;
    map<char, string> charkey;
    map<string, char> patkey;
    for(int i=0;i<str.size();i++)
    {
        if(charkey.find(pattern[i])==charkey.end())
            charkey[pattern[i]] = str[i];
        else if(charkey[pattern[i]] != str[i])
            return false;
        if(patkey.find(str[i])==patkey.end())
            patkey[str[i]] = pattern[i];
        else if(patkey[str[i]]!=pattern[i])
            return false;
    }
        return true;
    }
};
