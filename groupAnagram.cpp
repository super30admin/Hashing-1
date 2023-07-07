// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

#include <iostream>
#include <unordered_map>
#include <string>
using namespace std;

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
         

        vector<vector<string>> groups;
        
        unordered_map<string,vector<string>> hashmap;

        for (int i=0;i<=strs.size()-1;i++){
            string s= strs[i];

            sort(s.begin(),s.end());

            hashmap[s].push_back(strs[i]);
        }

        for(auto x:hashmap){
            groups.push_back(x.second);

        }

        return groups;



        
    }
};
