
#Time Complexity : O(1)
#Space Complexity : O(1)

#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

class Solution
{
    public:
        bool wordPattern(string pattern, string s)
        {
            vector<string> v;
            stringstream ss(s);
            string word;
            while( ss >> word ) v.push_back( word );

            if (v.size() != pattern.size()) return false;
            unordered_map<char, string> m;
            set<string> st;

            for (int i = 0; i < pattern.size(); i++){

                if (m.find(pattern[i]) != m.end()){
                    if (m[pattern[i]] != v[i]) return false;
                }
                else{
                   
                    if (st.count(v[i]) > 0) return false;
                    m[pattern[i]] = v[i];
                    st.insert(v[i]);
                }
            }

            return true;
        }
};