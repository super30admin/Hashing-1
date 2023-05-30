/*

// Time Complexity : O(m*n)// n is the number of elements and m is the average number of letters
// Space Complexity :O(m*n) //n is the number of elements and m is the average number of letters.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
Generating hash key and how to store ket value pair.

// Your code here along with comments explaining your approach
Generated hash key with character and their frequency , stored as key value pair.

*/


#include<iostream>
#include<vector>
#include<string>

using namespace std;

//display value in the hash table of characters.
void display(vector<vector<int>>& gg){
    for(auto vec:gg){
        for (auto i:vec){
            cout<<i<<"*";
        }
        cout<<endl;
    }
}

//to display the strings.

void display(vector<string> &str){
    for (auto st:str){
        cout<<st<<",";
    }
    cout<<endl;
}


class Solution {

int const alpha{97};
    
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string,vector<string>> table;
        for (auto str_val:strs){
            // to store the character frequency
            vector<short int>temp(26,0);
            for (short int c:str_val){
                temp.at(c-alpha)++;
            }
            // generate hash key with the character and its frequency
            string hashstr{};
            for(size_t i{0};i<temp.size();++i){
                if(temp.at(i)>0){
                    hashstr+=char(i+alpha);
                    hashstr+=to_string(temp.at(i));
                }
            }
            table[hashstr].push_back(str_val);
        }
        // transfering to 2d vector.
        vector<vector<string>> ops;
        for(auto val:table){
            vector<string> temp{val.second};
            ops.push_back(temp);
        }
        return ops;
    }
};

/*

best runtime leet code solution

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> mp{};
        vector <vector<string>> res;
        for (string& s : strs) {
            string t = s;
            sort(t.begin(), t.end());
            mp[t].push_back(s);
        }
        for (auto& p : mp) {
            res.push_back(move(p.second));
        }
        return res;

    }
};

*/

