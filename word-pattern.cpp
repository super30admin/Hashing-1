
// Time Complexity : O(n) , n is length of string s 
// Space Complexity : O(n) hashmap making for length of string
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach



class Solution {
    unordered_map<string, char> mymap;
    unordered_map<char, string> reversemap;
public:
    bool wordPattern(string pattern, string s) {
        int i=0;
        
            string temp = "";
            for( int k=0; k<s.size(); k++ ){
                if( s[k] == ' ' || k== s.size()-1 ){
                    if( k == s.size()-1){
                        temp += s[k];
                    }
                    if( mymap.find( temp ) == mymap.end() && reversemap.find( pattern[i] ) == reversemap.end() ){
                        mymap[temp] = pattern[i];
                        reversemap[pattern[i]] = temp;
                    } else if( mymap.find( temp ) != mymap.end() && reversemap.find( pattern[i] ) == reversemap.end() ){
                        return false;
                    } else if( mymap.find( temp ) == mymap.end() && reversemap.find( pattern[i] ) != reversemap.end() ){
                        return false;
                    } else {
                        char tomatch = mymap[temp];
                        if( tomatch != pattern[i] ){
                            return false;
                        }
                        string match = reversemap[tomatch];
                        if( match != temp ){
                            return false;
                        }
                    }
                    temp = "";
                    i++;
                } else {
                    temp += s[k];
                }
            }
        if( i != pattern.size() ){
            return false;
        }
        return true;
    }
};
