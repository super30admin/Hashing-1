// I used hashmaps to store the mapping and a set to store the values of the mapped chars
// I checked if the char is mapped already, if mapped then check if the mapped char is same. If the mapped char is diffrent return false. If the mapping is not present in the map , check the stack if the char from t string is in the set or not, if the char is present it means the char is already mapped with other char return false.
class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.length() != t.length()) return false;
        unordered_map<char, char> map;
        set<char> set;

        for(int i = 0;i<s.length(); i++){
            char cs = s[i];
            char ct = t[i];
            if(map.find(cs) != map.end()){
                if(map[cs] != ct) return false;
            }else {
                if(set.find(ct) != set.end()) return false;
                map.insert({cs, ct});
                set.insert(ct);
            }
        }
        return true;
    }
};
