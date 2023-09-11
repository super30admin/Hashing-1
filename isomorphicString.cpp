//Time complexity : O(n)
//Space complexity: O(n)
class Solution {
public:
    bool isIsomorphic(string s, string t) {
        unordered_map<char,char> map;
        unordered_set<char> set;

        for(int i=0;i<s.size();++i)
        {   
            //check if map has a key existing alread
            // if yes then also make sure that set doesnt
            //contain that value
            //if it does, that means we are double mapping -return false
            if(map.count(s[i]) && map[s[i]]!=t[i])
                return false;
            //check if key does not exost in map
            //if it does not, then before adding check if set has it
            //if set has it, that means character is already mapped
            //return false

            if(!map.count(s[i]) && set.count(t[i]))
                return false;
            set.insert( t[i]);
            map[s[i]]=t[i];
            
        }
        return true;
    }
};