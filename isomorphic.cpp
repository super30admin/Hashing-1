// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
#include <iostream>
#include <unordered_map>
#include <string>
using namespace std;

class isomorphic {
public:
    bool isIsomorphic(string s, string t) {
        unordered_map<char, char> Smap;
        unordered_map<char, char> tmap;

        if(s.length()==0 || t.length()==0){
            return true;

        }

        if(s.length()==0 && t.length()==0){
            return false;

        }

        for(int i=0;i<s.length();i++){

            if(Smap.find(s[i])==Smap.end()){
                Smap[s[i]]=t[i];


            }
            else {
                if (Smap.at(s[i])==t[i]){
                    Smap[s[i]]=t[i];

                }
                else{
                    return false;
                }

                
            }


            if(tmap.find(t[i])==tmap.end()){
                tmap[t[i]]=s[i];


            }
            else {
                if(tmap.at(t[i])==s[i]){
                    tmap[t[i]]=s[i];

                }
                else{
                    return false;
                }
            }
            
        
            


            
            


        }

        return true;








        
    }
};