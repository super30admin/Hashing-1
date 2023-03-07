class Solution {
public:
    bool wordPattern(string pattern, string s) {
        vector<string> strVector;
          char *token = strtok(const_cast<char*>(s.c_str()), " "); 
         while (token != nullptr) 
          { 
             strVector.push_back(std::string(token)); 
             token = strtok(nullptr, " "); 
          }

        //   if(string == nullptr || strVector == nullptr ) return false;
          if(strVector.size() != pattern.length() ) return false;

        unordered_map<char, string> umap;
        unordered_set<string> uset;

          for (int i=0; i< pattern.length();i++){
              if(umap.find(pattern[i]) == umap.end() && uset.find(strVector[i]) == uset.end()){
                  umap[pattern[i]] = strVector[i];
                  uset.insert(strVector[i]);
              }
              else if (umap.find(pattern[i]) == umap.end() && uset.find(strVector[i]) != uset.end()){
                  return false;
              }
              else if(umap.find(pattern[i]) != umap.end() && (strVector[i]) != umap[pattern[i]]){
                  return false;
              }
          }
          
        return true;
    }
};