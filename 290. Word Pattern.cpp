/*
Time: O(n)
Space: O(n)

Approach: Keep the mapping from pattern to string in a hashmap, and keep if the string is mapped already is a hashedset
*/

class Solution {
public:
    vector<string> words(string s){
      vector<string> ret = {};
      string word = "";

      for(auto c: s){
        if(c==' '){
          ret.push_back(word);
          word = "";
        }
        else{
          word += c;
        }
      }

      ret.push_back(word);
      return ret;
    }

    bool contain(unordered_set<string>& taken, string& s){
      return taken.find(s) != taken.end();
    }

    bool wordPattern(string pat, string s) {
      auto w = words(s);
      if(pat.length() != w.size())  return false;
      
      unordered_map<char, string> m;
      unordered_set<string> taken;

      for(int i=0;i<pat.length();i++){
        auto c = pat[i];
        auto s = w[i];

        //pattern mapped to another string
        if(m.count(c)!=0 && m[c]!=s){
          return false;
        }
        //string matched to another pattern
        else if(contain(taken, s)){
          if(m.count(c)==0 || m[c]!=s)  return false;
        }
        //either pattern and string map to each other or no mapping
        else{
          m[c] = s;
          taken.insert(s);
        }

      }

      return true;
    }
};
