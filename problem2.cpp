/*

// Time Complexity : O(n) // length of the string
// Space Complexity : O(N) // cause extra space for the string size 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
Important to know that <key,value> pair is unique . Its one to one function.

// Your code here along with comments explaining your approach
created two hash maps to store the values of their respective indexes.
if these values unmatch then return false.
*/

#include<iostream>
#include<vector>
#include<string>

using namespace std;

class Solution {

public:
    bool isIsomorphic(string s, string t) {
        const size_t max_len(256);
        vector<int> hash_arr1(max_len,-1);
        vector<int> hash_arr2(max_len,-1);
        for (size_t i{0};i<s.size();++i){
            int key1{s.at(i)};
            int key2{t.at(i)};
            //check if the key has been defined before or the value has been defined before.
            if(hash_arr1.at(key1)==-1 && hash_arr2.at(key2)==-1){
                hash_arr1.at(key1) = key2;
                hash_arr2.at(key2) = key1;
            }
            else if(hash_arr1.at(key1) == key2 && hash_arr2.at(key2) == key1){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
};

/*

later figure out to use bool for the ascii values used to make it more memory efficient .

class Solution {

public:
    bool isIsomorphic(string s, string t) {
        const size_t max_len(256);
        vector<int> hash_arr1(max_len,-1);
        vector<bool> hash_arr2(max_len,false);
        for (size_t i{0};i<s.size();++i){
            int key1{s.at(i)};
            int key2{t.at(i)};
            if(hash_arr1.at(key1)==-1 && hash_arr2.at(key2)==false){
                hash_arr1.at(key1) = key2;
                hash_arr2.at(key2) = true;
            }
            else if(hash_arr1.at(key1) == key2 && hash_arr2.at(key2) == true){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
};

*/

/*

//works with all lower case letters but not with ascii values.

class Solution {

const int alpha{97};

public:
    bool isIsomorphic(string s, string t) {
        vector<int> hash_arr1(26,-1);
        vector<int> hash_arr2(26,-1);
        for(size_t i{0};i<s.size();++i){
            int key_1{s.at(i)-alpha};
            int key_2{t.at(i)-alpha};
            if(hash_arr1.at(key_1) == -1 && hash_arr2.at(key_2) == -1){
                hash_arr1.at(key_1) = t.at(i);
                hash_arr2.at(key_2) = s.at(i);
            }   
            else if(hash_arr1.at(key_1) == t.at(i) && hash_arr2.at(key_2) == s.at(i)){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
};

*/