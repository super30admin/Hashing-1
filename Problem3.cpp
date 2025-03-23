// Time Complexity : O(N) N is size of pattern
// Space Complexity : O(N) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : unable to figure out duplicate words


// Your code here along with comments explaining your approach:
// 1. Split sentence to words and store it in vector.
// 2. Create map to track if each char is assigned to unique word and vice-versa
// 3. If element already exist return false.

class Solution {
public:
    vector<string> split_sentence(string sen) {
        stringstream ss(sen);
        string word;
        
        vector<string> words;
        
        while (ss >> word) {
            words.push_back(word);
        }
        
        return words;
    }
    bool wordPattern(string pattern, string s) {
        int ii=0;
        map<char,string> m;map<string,char> mm;
        vector<string> sv= split_sentence(s);
        //cout<<sv.size() << ' ' << s.size() <<'\n';
        if(sv.size()!= pattern.size()){
            return 0;
        }
        for(int i=0;i<pattern.size();i++){
            cout<<sv[ii]<<' ';
            if(m[pattern[i]]=="" && (ii<sv.size()) && mm[sv[ii]]==NULL){
                m[pattern[i]]=sv[ii];mm[sv[ii]]=pattern[i];
            }else{
                if(m[pattern[ii]]!=sv[ii] || mm[sv[ii]]!=pattern[ii]){
                    return 0;
                }
            }
            ii++;
        }
        return 1;
    }
};