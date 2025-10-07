class Solution {
public:
    bool isIsomorphic(string s, string t)
    {
        if (s.size() != t.size()) {
            return false;
        }

        int i = 0;
        unordered_map<char, char> sMap;
        unordered_set<char> tSet;

        while (s[i]) {
            if (!sMap.contains(s[i])) {
                if (tSet.contains(t[i])) {
                    return false;
                }

                sMap[s[i]] = t[i];
                tSet.insert(t[i]);
            } else if (sMap[s[i]] != t[i]) {
                return false;
            }

            ++i;
        }

        return true;
    }
};
