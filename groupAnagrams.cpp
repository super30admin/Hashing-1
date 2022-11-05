//Approach 1
//Hashmap using sorted strings as keys

// Time Complexity : O(nk.logk) klogk for sorting done n times 
// Space Complexity : O(n)  
// Did this code successfully run on Leetcode : Yes

/*
sort each string and save that as the key of the hasmap and the strings from the question as the values in a vector 

iterate over the map and return the vector of vectors
*/

//Approach 2
//Hashmap using custom has function (product of prime numbers)

// Time Complexity : O(nk) look up is now in constant time
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : Yes

/*
give each letter a prime number 
hash function will be the product of the numbers 
iterate over the map and return the vector of vectors
*/


class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> map;
        if(strs.size() == 0) return vector<vector<string>>();
        for (int i=0; i<strs.size(); i++){
            string sorted = strs[i];
            sort(sorted.begin(), sorted.end());
            map[sorted].push_back(strs[i]);
        } //O(k log k)
        unordered_map<string, vector<string>>::iterator it;
        vector<vector<string>> result;
        for(it = map.begin(); it!=map.end(); it++){
            result.push_back(it->second);
        }
        return result;
    }
};


class Solution {
private:
    double getHashValue(string s){
        //calculate the prime product and use that as the hash function
        vector<int> hash_mappings = vector<int> ({2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 103});
        double hashValue = 1;
        for(char c: s)
            hashValue *= hash_mappings[c-'a'];
        return hashValue;
    }
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        if(strs.size() == 0) return vector<vector<string>>();
        
        unordered_map<double, vector<string>> map;
        
        for (int i=0; i<strs.size(); i++){
            double hashValue;
            hashValue = getHashValue(strs[i]);

            // don't have to check if key is present
            // just push it back to the value 
            map[hashValue].push_back(strs[i]);
        }
        vector<vector<string>> result;
        for(auto key:map){
            result.push_back(key.second);
        }
        //check when it has to be key->second vs key.second 

        return result;
    }
};

