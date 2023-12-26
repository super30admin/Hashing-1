//290. Word Pattern

/*
split the string by space to get words and store in a vector
hash map each word of this to the char of in pattern and vice versa in another hash map data structure
if there is no pre-existing mapping, add it
If there is already mapping to another char and word return false - we conclude there is no pattern

*/

class Solution {
public:
    bool wordPattern(string pattern, string s) {    
    //get words
    vector<string> w;
    std::string word; 
    std::istringstream iss(s);
    while (std::getline(iss, word, ' ')) {
        w.push_back(word);        
    }
    map<string, char> sTop;
    map<char, string> pTos;

    //then do usual hash maps stuff
    if(w.size() != pattern.size()) return false;
    if(w.size() == pattern.size()){
        for(int i=0; i<pattern.size();i++){
            char p = pattern[i];
            string wo = w[i];

            if(sTop.find(wo) == sTop.end() && pTos.find(p) == pTos.end()){
                sTop[wo] = p;
                pTos[p] = wo;
            }
            else{
                if(sTop[wo] != p && pTos[p] != wo){
                    return false;
                }
            }
        }
    }

    return true;

    }
};