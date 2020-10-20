//Time Complexity : O(n) where n is the length of input string
//Space Complexity : O(3n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this :
            //1. Yes, I had to use 3rd map to save the pair of a char from 'pattern' and a word from 's'.
            //2. When number of characters in 'pattern' is not equal to number of words in 's', it took me time to figure out the conditions that are written at the bottom of the function.


class Solution {
public:
    bool wordPattern(string pattern, string s) {
        
        stringstream ss(s);
        string temp;
        map<string, int> word;
        map<string, int>::iterator itr2;
        
        map<char, int> letter;
        map<char, int>::iterator itr1;
        
        map<char, string> match;
        int i = 0;
        while(ss >> temp && i < pattern.size()){
            itr1 = letter.find(pattern[i]);
            itr2 = word.find(temp);
            
            if(itr1 == letter.end() && itr2 == word.end()){
                word.insert(make_pair(temp, 1));
                letter.insert(make_pair(pattern[i], 1));
                match.insert(make_pair(pattern[i], temp));
            }
            else if(itr1 != letter.end() && itr2 != word.end()){
                if(match[pattern[i]] != temp)
                    return false;
            }
            else
                return false;
            
            i++;
            temp = "";
        }
        ss >> temp;
        
        if(temp != "" || i != pattern.size())
            return false;
        else
            return true;
    }
};
