//Time Complexity = O(K) where K = min(M, N)  where M = number of characters in Pattern & N = Number of words in s

//Space Complexity = O(E)  where E = Number of unique words in s
// In worst case E = 26 ~ O(26) ~ O(1) asymptotically 


class Solution {
public:
    bool wordPattern(string pattern, string s) 
    {
        unordered_map<char,int> m1;
        unordered_map<string,int> m2;
        
        int i=0;
        istringstream in(s);
        string word;
        int n = pattern.size();
        
        for(word;in>>word;i++){
            if(i==n || m1[pattern[i]]!=m2[word] ) return false;
            m1[pattern[i]] = m2[word] = i+1;
        }
        return i==n;
    }
};
