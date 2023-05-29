/*

// Time Complexity : O(N) // string length
// Space Complexity : O(N) // to store the words
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
the edge cases where the length of pattern and number of
words in the string can differ
Moreover, the each key value pair is unique.
One to one mapping between key and value.
*/



#include<iostream>
#include<vector>
#include<string>

using namespace std;

class Solution {
public:
    bool wordPattern(string pattern, string s) {
        const int vec_len{26};
        const int alpha{97};
        /*
        vector of strings so that each small letter
        is mapped to a word, Initalized with space.
        */
        vector<string> str(vec_len," ");
        unordered_map<string,bool> word;
        int i{},j{};
        int word_count{};
        for(;i<pattern.size();++i){
            /*
            To break if end of strings
            */
            if(j>=s.size()){
                break;
            }
            /*
            to find the word
            */
            string temp{};
            while(j!=s.size() && s.at(j)!=' ' ){
                temp+=s.at(j++);
            }
            ++word_count;// counting number of words.
            cout<<temp<<endl;
            int key1{pattern.at(i) - alpha};// find the key of the small alphabet
            //first check to make sure that neither key nor the word is used.
            if(str.at(key1) == " " && !word.count(temp)){
                str.at(key1) = temp;
                word.insert(make_pair(temp,true));
            }
            // check if the pair exist then continue do nothing 
            else if(str.at(key1) == temp){
                //cout<<"works"<<endl;
            }
            // if key pair mismatch exit.
            else{
                return false;
            }
            j++;
        }
        /*if number of words not equates the pattern length
        as the number of words can be less than the 
        pattern length.

        examples :
        pattern = 'abab'
        string  = 'cat got'

        */
        if(word_count!=pattern.size()){
            return false;
        }
        /*
        if not all words have been used implies 
        the pattern length is less than the total number of words.
        */
        if(j<s.size()){
            return false;
        }
        return true;
    }
};