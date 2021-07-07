Time Complexiy-O(n) Here 'n' is the size of str 
Space Complexity-O(1) As maximum number of distinct values that can be mapped is equal to 26 and it is constant.
Did the code run on Leetcode? Yes

#include <iostream>
#include<vector>
#include<map>
using namespace std;

class Solution {
public:
    bool wordPattern( string pattern,string str) {
        int count1=0,count2=0;
        string k="";
        vector<string>m;
        map<char,int>res1;
        map<string,int>res2;
        for(int i=0;i<str.size();i++)
        {
            if(str[i]==' ')
            {
                m.push_back(k);
                k="";
            }
            else
            {
                k=k+str[i];
            }
        }
        m.push_back(k);
        for(int i=0;i<pattern.length();i++)
        {
            res1[pattern[i]]=i;
        }
        for(int i=0;i<m.size();i++)
        {
            res2[m[i]]=i;
        }
        for(auto i=res1.begin();i!=res1.end();i++)
        {
            count1+=i->second;
        }
        for(auto i=res2.begin();i!=res2.end();i++)
        {
            count2+=i->second;
        }
        if(res1.size()==res2.size()&& count1==count2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
};

int main() {
    string s1="abba";
    string s2="dog cat dog dog";
	bool y;
	Solution soln;
	y=soln.wordPattern(s1,s2);
	cout<<y;
	return 0;
}
