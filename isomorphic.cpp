// Time Complexity : O(n) Iterating over the string
// Space Complexity : O(1)  The length of the hashmaps is upperbounded by the length of the alphabet
// Did this code successfully run on Leetcode : Yes

/*
Approach 1: 2 hashmaps 
Crete one hashmap to store mappings from s->t 
It is a 1:1 mapping, ie 
a:d
but if we have x:d, the strings are not isomorphic 
s = eggs
t = adda 
Hence we have another hashmaps to store t->s 
*/

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.length() != t.length())
            return false;
        unordered_map<char,char> s_map;
        unordered_map<char,char> t_map;
        for(int i=0; i<s.length(); i++){
            //if the key is present, the value has to be what the string is pointing to
            //return false otherwise
            if(s_map[s[i]]){
                if(s_map[s[i]] != t[i])
                    return false;
            }
            else
                //if key not there, add it
                s_map[s[i]] = t[i];
            
            //repeat the same thing for t->s
            if(t_map.count(t[i])){
                if(t_map[t[i]] != s[i])
                    return false;
                }
                else
                    t_map[t[i]] = s[i];
        }
        //if it reaches this point, we have exhausted the string and the result is true 
        return true;
    }
};

/*
Approach 2: Hashmap and Hashset 
Track s->t in the hashset and if we've seen the letter in t, instead of saving it in a hashmap, save it in a hashset
If the letter is in the hashset, that means there is already a mapping from s -> t and this letter should not be mapped to anything else 

s = eggs
t = adda 
i.e. we see a but we know e:a is already present and s:a can't exist. So return false
*/

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.length() != t.length())
            return false;
        unordered_map<char,char> s_map;
        unordered_set<char> t_set;
        for(int i=0; i<s.length(); i++){
            if(s_map[s[i]]){
                if(s_map[s[i]] != t[i])
                    return false;
            }
            // if we need to add a new character, and the t[i] is already in the hashset, that means the character is already mapped to something else
            else {
                //if its present in hashset, return false
                if(t_set.count(t[i]))
                    return false;
                //else add it to both hashmap and hashset
                s_map[s[i]] = t[i];
                t_set.insert(t[i]);
            }
        }
        return true;
    }
};