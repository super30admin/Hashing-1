// Time Complexity : O(kn) where k is ther average length of each word in s and n is the length of the pattern 
// Space Complexity : O(1)  The length of the hashmap is upperbounded by the length of the alphabet and thus hashset also can't exceed 26 (or 52)
// Did this code successfully run on Leetcode : Yes

/*
Hashmap and Hashset 
go ovet the pattern and create the hashset 
if the pattern is not there in the hashset, while adding make sure the value (word) has already not been mapped to a different pattern
we do this by adding all the words in a hashset and checking from here would be O(k)
*/


class Solution {
vector<string> splitString(string s){
    vector<string> result;
    stringstream ss (s);
    string word;
    while(ss >> word)
        result.push_back(word);
    return result;
}
public:
    bool wordPattern(string pattern, string s) {
        unordered_map<char, string> pattern_map;
        unordered_set<string> s_set;
        vector<string> s_array;
        
        s_array = splitString(s);
        if(pattern.length() == 0 || (pattern.length()!=s_array.size()))
            return false;
        
        for(int i = 0; i<pattern.length(); i++){
            
            //if key not found
            if(pattern_map.find(pattern[i]) == pattern_map.end()){
                //if value is found in hashset, that means it was already mapped to something else => return false
                if(s_set.count(s_array[i])) 
                    return false;
                //eles add the key value pair to hashmap and hashset 
                pattern_map[pattern[i]] = s_array[i];
                s_set.insert(s_array[i]);
            }
            
            //if key was found
            //if the value from the map != the new string from s_array, return false
            //otherwise do nothing
            else if((pattern_map[pattern[i]].compare(s_array[i])) != 0) 
                    return false;
        }
        
        return true;
    }
};