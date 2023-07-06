class Solution {
public:
    string getSign(string st) {
        sort(st.begin(), st.end());
        string res = "";
        for(int i = 0; i<st.size(); i++) {
            res = res + '#'  + st[i];
        }
        return res;
    }
    vector<vector<string>> groupAnagrams(vector<string>& v) {
        vector<vector<string>> res;
        unordered_map<string, vector<string>> m;
        for(string s : v) {
            string sign = getSign(s);
            if(m.find(sign)  == m.end()) {
                m[sign].push_back(s);
            } else {
                m[sign].push_back(s);
            }
        }
        for(auto x : m) {
            vector<string> temp;
            for(auto y : x.second) {
                temp.push_back(y);
            }
            res.push_back(temp);
        }
        return res;
    }
};
