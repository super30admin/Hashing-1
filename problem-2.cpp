//3205. Isomorphic Strings
// Time Complexity : O(n)
// Space Complexity : O(2n)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

/* 
    taking two hashmaps and maps each character in the string1 to string2 of same index,
    if any characters maps to the same character then returns false. do the same with string 2 to string 1 and store it in second hashmap.
*/


// Your code here along with comments explaining your approach

bool isIsomorphic(string s, string t) {
    unordered_map<char, char> smap;
    unordered_map<char, char> tmap;
    for(int i = 0; i < s.size(); i++)
    {
        if(smap.find(s[i]) == smap.end())
            smap[s[i]] = t[i];
        else if(smap[s[i]] != t[i])
            return false;
        if(tmap.find(t[i]) == tmap.end())
            tmap[t[i]] = s[i];
        else if(tmap[t[i]] != s[i])
            return false;
    }
    return true;

}
