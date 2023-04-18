// Time Complexity: O(n)
// Space Complexity: O(n)
// Did this code successfully run on Leetcode : Yes
// split the string s into words.
// used one map and one set. map is for checking if character is mapped and to which string it is mapped.
//  set is for checking whether if word is mappped.



class Solution {
public:
    bool wordPattern(string pattern, string s) {
        size_t pos = 0;
        vector<string>words;
        while((pos = s.find(" "))!= string::npos)
        {
            string p = s.substr(0,pos);
            words.push_back(p);
            s.erase(0,pos+1);
        }
        if(!s.empty())
        {
            words.push_back(s);
        }
        if(words.size()!=pattern.size()) return false;
        unordered_map<char,string>map;
        unordered_set<string>set;
        for(int i=0;i<pattern.size();i++)
        {
            char ch = pattern[i];
            string str = words[i];
            if(map.find(ch)!=map.end())
            {
                if(map[ch]!=str) return false;
            }
            else if(set.find(str)!=set.end())
            {
                return false;
            }
            else{
                map[ch]=str;
                set.insert(str);
            }
        }
        return true;
        
    }
};