// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
#include <iostream>
#include <unordered_map>
#include <string>
#include <sstream>


using namespace std;
class wordPatter {
public:
    bool wordPattern(string pattern, string s) {


        if(pattern.length()==0 && s.length()==0){
            return true;
        }

        if(pattern.length()==0 || s.length()==0){
            return false;
        }


        vector<string> arr;
        stringstream ss(s);  

        int count=0;
        string str;
         while (getline(ss, str, ' ')) {
        // `str` is used to store the token string while ' ' whitespace is used as the delimiter. 
           arr.push_back(str);
         }
        if(arr.size() != pattern.length()){
            return false;
        }

        unordered_map< char,string> sMap;
        unordered_map<string,char> tMap;

        for (int i=0;i<pattern.length();i++){
            if(sMap.find(pattern[i])==sMap.end()){
                sMap[pattern[i]]=arr[i];

            }
            else{
                if(sMap.at(pattern[i])== arr[i]){
                    sMap[pattern[i]]=arr[i];
                }

                else{
                    return false;
                }
            }



            if(tMap.find(arr[i])==tMap.end()){
                tMap[arr[i]]=pattern[i];
            }

            else{
                if(tMap.at(arr[i])==pattern[i]){
                    tMap[arr[i]]=pattern[i];

                }
                else{
                    return false;
                }
            }
        }

        return true;




        

    }
};