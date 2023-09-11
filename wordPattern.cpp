//Time complexity: O(n)
//Space complexity:O(n)
class Solution {
public:
    bool wordPattern(string pattern, string s) {
        unordered_map<char, string> map;
        unordered_set<string> set;
        vector<string>v;
        string word;
        
        //important to notice in the string given 
        //we have whitespaces
        //use stringstream to remove them
        stringstream ss(s);
        while(ss>>word) v.push_back(word);
        //edge case: size of chars and string different->return false
        if(pattern.size()!=v.size())
            return false;

        for(int i=0;i<pattern.size();i++)
        {   
            //map has a key go check if set has diff value, if yes return false
            
            if(map.count(pattern[i]) && map[pattern[i]]!=v[i])
                return false;
            //if map doesnt have a key but set does have a value that is currently
            //being processed by v[i] means that it has been already mapped with 
            //something else -> return false
            if(!map.count(pattern[i]) && set.count(v[i]))
                return false;
        //else put the key in map and update the set
            map[pattern[i]]=v[i];
            set.insert(v[i]);

            

        }
        return true;
    }
};