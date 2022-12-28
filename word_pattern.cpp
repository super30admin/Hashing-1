class Solution {
private:
    vector<string> make_strList(string str) {
        vector<string> ret;
        string word;
        for ( int i = 0; i < str.length(); i++ ) {
            if ( str[i] == ' ') {
                ret.push_back(word);
                word.clear();
            } else
                word.push_back(str[i]);
        }
        ret.push_back(word);
        return ret;
    }
public:
    bool wordPattern(string pattern, string s) {
        vector<string>svec;
        svec = make_strList(s);
        unordered_map<char,string>ch2strmap;
        unordered_set<string>word;
        if ( svec.size() != pattern.size() ) return false;
        for(int i=0;i<pattern.length();i++){
            if(ch2strmap.find(pattern[i])==ch2strmap.end()){
                if(word.find(svec[i])!=word.end()){
                    return false;
                }
                else{
                    ch2strmap[pattern[i]]=svec[i];
                    word.insert(svec[i]);
                }
            }
            else{
                if (ch2strmap[pattern[i]]!=svec[i]){
                    return false;
                }
            }
        }
    return true;
    }
};
