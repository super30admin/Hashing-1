// Time Complexity: O(n)
// Space Complexity: O(n)
// We use only one map in this solution.
// We need to maintain mappings from string t to string t and also from t to s. So we
//  add "s_" and "t_" before a key while adding in the map from s and t respectively.
//  if "s_"+key exists in map, we check if value = t[i] 
//  if("s_"+key ) not exists, we check if "t_"+t[i] is present in map and is matching with s[i].
//  else we add values to respective keys.



class Solution {
public:
    bool isIsomorphic(string s, string t) {
        int n = s.size();
        int m = t.size();
        if(n != m) return false;
        unordered_map<string, string> mp;
        for(int i = 0; i < n; i++)
        {
            string str = s.substr(i,1);
            string ttr = t.substr(i,1);
            if(mp.find("s_" + str ) != mp.end())
            {
                if(mp["s_" + str]!= ttr)
                {
                    return false;
                }
            }
            
            else if(mp.find("t_" + ttr) != mp.end() && mp["t_" + ttr] != str)
            {
                return false;
            }
            else
            {
                mp["s_" + str ] = ttr;
                mp["t_" + ttr] = str;
            }
        }
        return true;
    }
};