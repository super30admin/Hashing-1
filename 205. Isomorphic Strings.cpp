/*
Time: O(n)
Space: O(n)

Approach: Keep the mapping from t to s in a hashmap, and track if the string is mapped already is a hashedset
*/

class Solution {
public:
    bool contain(unordered_set<char>& taken, char& c){
      return taken.find(c) != taken.end();
    }

    bool isIsomorphic(string s, string t) {
      if(s.length() != t.length())  return false;
      
      unordered_map<char, char> m;
      unordered_set<char> taken;

      for(int i=0;i<s.length();i++){
        auto c = s[i];
        auto s = t[i];

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
