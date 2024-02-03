/*
Time Complexity: O(n)
Space Complexity: O(n)

Approach: Get the frequency array as string for each words and use it as a key to map anagramic strings together
*/

class Solution {
public:
    string get_bucket(string &s){
      vector<int> freq(26,0);

      for(char c: s){
        freq[c-'a']++;
      }
      
      string ret = "";
      for(auto u: freq)  ret += to_string(u) + '+';
      return ret;
    }

    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> m;
        vector<vector<string>> ret;
        
        for(auto &s: strs){
          auto v = get_bucket(s);
          if(m.count(v)==0)  m[v] = {};
          m[v].push_back(s);
        }
        
        for(auto &p: m){
          ret.push_back(p.second);
        }

        return ret;
        
    }
};
