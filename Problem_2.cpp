class Solution {
public:
    string getSignature(string s) {
        string res = "";
        int idx = 0;
        unordered_map<char, int> m;
        for(int i = 0; i<s.size(); i++) {
            if(m.find(s[i]) == m.end()) {
                m[s[i]] = idx++;
            }
            res += to_string(m[s[i]]) + '#';
        }
        return res;
    }
    bool isIsomorphic(string s, string t) {
        string sign_s = getSignature(s);
        string sign_tt = getSignature(t);
        // cout<<sign_s << " == "<<sign_tt<<endl;
        for(int i = 0; i<sign_s.size(); i++) {
            if(sign_s[i] == sign_tt[i]) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
};
