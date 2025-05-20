// I used similar appreoach to the isomorphic question
class Solution {
public:
    bool wordPattern(string pattern, string s) {
        unordered_map<char, string> map;
        set<string> set;
        vector<string> words;
        stringstream ss(s);
        string word;

        while (ss >> word) {
            words.push_back(word);
        }

        if(pattern.length() != words.size()) return false;

        for(int i = 0; i < pattern.length(); i++){
            char sChar = pattern[i];
            string tString = words[i];

            if(map.find(sChar) != map.end()){
                if (map[sChar] != tString) return false;
            }else {
                if (set.find(tString) != set.end()) return false;
                map[sChar] =  tString;
                set.insert(tString);
            }
        }
        return true;
    }
};
