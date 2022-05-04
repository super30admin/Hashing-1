//Time = O(N) ----> N = length of the string
//SPACE = O(1)

//We hash using s as key and t as value
// If the same key is mapped to a different value we return false
//If this returns true, we perform the same proces using t as key and s as value
//This should also return true for both to be isomorphic to each other.


class Solution {
public:
    bool hash(string s, string t) {
        unordered_map<char,char> hash;
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            if(hash.find(s[i])!=hash.end()){
                if(hash[s[i]]!=t[i])
                    return false;
            }else{
                    hash[s[i]] = t[i];
            }   
        }
        return true;
    }
    
    bool isIsomorphic(string s, string t){
        return hash(s,t) && hash(t,s);
    }
};

