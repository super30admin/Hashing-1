// Time Complexity : O(N)   .... N is nothing but length of the string
// Space Complexity : O(256) ~ O(1)  .... character array of size 256 is used, but its constant for all scenarios hence O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 

/*
Leetcode :  https://leetcode.com/problems/isomorphic-strings/
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
*/


/*
Approach one : Using two maps
This solution uses two character hashmap.
sMap is used to store character from string s as a key and character from t as a value.
tMap is used to store character from string t as a key and character from s as a value.

We will iteraret through each character.
If character is not found in a map then it is inserted.
else if it is present then corresponding value if checked with other string character,
if it is not matching that means strings are not isomentrics.

*/


class Solution {
public:
    bool isIsomorphic(string s, string t) {

        if(s.size() == 0 && t.size() == 0) return true;
        if(s.size() != t.size()) return false;

        std::unordered_map<char,char>sMap;
        std::unordered_map<char,char>tMap;
        int size = s.size();

        for(int i=0; i<size; i++){              // O(N)
            char sChar = s.at(i);
            char tChar = t.at(i);

            if(sMap.find(sChar) == sMap.end()){
                sMap[sChar] = tChar;
            } else {
                if (sMap[sChar] != tChar) return false;
            }
            if(tMap.find(tChar) == tMap.end()){
                tMap[tChar] = sChar;
            } else {
                if (tMap[tChar] != sChar) return false;
            }
        }
        return true;
    
    }
};

/*
Approach Two : Using two Array
Above logic can be implemented using Array and hashing function can be used to identify the index

Strings can conatain any character form 256 ASCII values.
Arrays are used to store characters of each string and (character - ' ') provides the
index corresponding to each element in array. ASCII starts with ' ' and not 'a'
sArray will use character from string S as a key and store its corresponding value from
String t to that location.
Similarly tArray will store values of string S.

We will iteraret through each character.
s[i] is taken as a key and t[i] is value for sArray. If sArray[s[i] - ' '] value is null i.e. '\0'
thrn we will insert value there, but if it is not '\0' then we will check if the present value is
equal to t[i]; if not then strings are not isometric and we return false.
Similarly we check for tArray.
*/

class Solution {
public:
    bool isIsomorphic(string s, string t) {

        if(s.size() == 0 && t.size() == 0) return true;
        if(s.size() != t.size()) return false;
        char sArray[256] = {};
        char tArray[256] = {};
        int size = s.size();
        for(int i=0; i < size; i++){           // O(n)
            char sChar = s.at(i);
            char tChar = t.at(i);
            if(sArray[sChar - ' '] == '\0') {
                sArray[sChar - ' '] = tChar;
            } else {
                if (sArray[sChar - ' '] != tChar) return false;
            }
            if(tArray[tChar - ' '] == '\0') {
                tArray[tChar - ' '] = sChar;
            } else {
                if(tArray[tChar - ' '] != sChar) return false;
            }
        }
        return true;
    
    
    }
};

