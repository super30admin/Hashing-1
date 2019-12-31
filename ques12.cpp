TIme Complexity-O(n)
Space Complexity-O(1)
Did the code run on Leetcode? Yes

#include <iostream>
#include<map>
using namespace std;

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        map<char,char>m;
        map<char,char>k;
        for(int i=0;i<s.size();i++)
        {
            if(m.count(s[i]))
            {
                if(m[s[i]]!=t[i])
                    return false;
            }
            else if(k.count(t[i]))
            {
                if(k[t[i]]!=s[i])
                    return false;
            }
            m[s[i]]=t[i];
            k[t[i]]=s[i]; 
        }
         return true;   
    }
};

int main() {
    bool y;
    string s="egg";
    string t="adf";
	Solution soln;
	y=soln.isIsomorphic(s,t);
	cout<<y;
	return 0;
}