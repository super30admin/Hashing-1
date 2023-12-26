// Time Complexity :  O(N)

// Space Complexity : O(1) -> O(26)

// Did this code successfully run on Leetcode : Yes

// Appoarch: First used stringstream to break the words
// in string s and stored it in a vector. Then, created a hashmap 
// to store one way mapping and hashset to store the unique values.  


#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool wordPattern(string pattern, string s) {
        vector<string> v;
        stringstream ss(s);
        string word;
        while(ss >> word){
            v.push_back(word);
        }
        if(v.size() != pattern.size()){
			return false;
		}
        unordered_map<char, string> m;
		set<string> st;
        for(int i = 0; i < pattern.size(); i++){
			if(m.find(pattern[i]) != m.end()){
				if(m[pattern[i]] != v[i]){
					return false;
				}
			}
			else{
				if(st.count(v[i]) > 0){
					return false;
				}
				m[pattern[i]] = v[i];
				st.insert(v[i]);
			}
		}
		return true;

    }
};