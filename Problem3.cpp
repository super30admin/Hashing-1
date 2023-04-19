// ## Problem 3:
// Given a pattern and a string str, find if str follows the same pattern.
// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

// Example 1:
// Input: pattern = "abba", str = "dog cat cat dog"
// Output: true

// Example 2:
// Input:pattern = "abba", str = "dog cat cat fish"
// Output: false

// Example 3:
// Input: pattern = "aaaa", str = "dog cat cat dog"
// Output: false

// Example 4:
// Input: pattern = "abba", str = "dog dog dog dog"
// Output: false
// Notes:
// You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.


// TC: O(pattern_size * max_size of a word in s)  /*I HAVE DOUBT REFARDING THIS CORRECT ME IF I AM WRONG*/
// SC:O(1)

// In this I am first splitting a string at spaces and storing in a vector<string>, and then for each char in
//  pattern there should be unique mapping( Bijection) for this monitoring I am using two maps ,
// If I find a char of pattern in a map I will check the corresponding word is not same as the current word I will return,
// Else I will check in word map whether this word exists already if so i will return else I will insert in both the maps.

class Solution {
public:
    bool wordPattern(string pattern, string s) {
     
     unordered_map<char,string>P;
     unordered_map<string,char>S;

    std::stringstream ss(s); // create a stringstream object initialized with the string
    std::vector<std::string> words; // create a vector to store the words
    std::string word;
    while (ss >> word) { // read each word from the stringstream
        words.push_back(word); // add the word to the vector
        cout<<word<<endl;
    }

    if(words.size()!=pattern.size())
     return false;
        
    for(int i=0;i<pattern.size();i++)
    {
        if(P.find(pattern[i])!=P.end())    
        {
            if(P[pattern[i]]!=words[i])
            {
                return false;    
            }
        }
        else
        {
              if(S.find(words[i])!=S.end())
              {               
                  return false;                  
              }
            
            P.insert(make_pair(pattern[i],words[i]));
            S.insert(make_pair(words[i],pattern[i]));
             
        } 

    }
    return true;
    }
};