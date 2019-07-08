//
// Created by shazmaan on 7/8/2019.
//

#include <iostream>
#include <algorithm>
#include <set>
#include <string>
#include <map>

using namespace std;

class Solution{
private:
    map<char,char> hashmap;
    set<char> hashset;
public:
    bool isIsomorphic(string s, string t) {
        map<char,char>::iterator it;
        for(int x =0; x<s.size(); x++){
            it = hashmap.find(s[x]);
            auto check = hashset.insert(t[x]);
            if((it==hashmap.end()) && check.second){
                hashmap.insert(pair<char,char>(s[x],t[x]));
            }else if(hashmap[s[x]]!=t[x]){
                return false;
            }
        }
        return true;
    }
};


int main(){
    Solution s; cout<<s.isIsomorphic("ab","aa")<<endl;
    return 0;
}