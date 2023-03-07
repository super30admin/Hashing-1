class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<double,vector<string>> umap;
        vector<vector<string>> angramGroups;

        for(int i =0; i<strs.size();i++){
            // string sortedKey = strs[i];
            // int size= strs[i].size();
            // sort(sortedKey.begin(), sortedKey.end());
            double key = getHashValue(strs[i]);
            if(umap.find(key)== umap.end()){
                umap[key] = vector<string>();
            }
            umap[key].push_back(strs[i]);
        }
        unordered_map<double, vector<string>>::iterator it;
        for( it=umap.begin(); it !=umap.end();it++){
            angramGroups.push_back(it->second);
        }
      return angramGroups;  
    }

        double getHashValue(string s){
        vector<int> primeValues ={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        double hashvalue = 1;
        for (int i =0; i<s.length();i++ ){
            hashvalue= hashvalue * primeValues[s[i]-'a'];
        }
        return hashvalue;
    } 
};