Time Complexity-O(n*klogk)
Space Complexity-O(n*k)
Did the code run on Leetcode? Yes
Problem Faced: I got little confusion with calculating space complexity here, But although later i got it after the class.

#include <iostream>
#include<vector>
#include<map>
#include<algorithm>
using namespace std;

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>>m;
        map<string,vector<string>>k;
        for(auto i=0;i<strs.size();i++)
        {
            string a=strs[i];
            sort(a.begin(),a.end());
            if(k.find(a)==k.end())
            {
                k[a]={};    
            }
            k[a].push_back(strs[i]);
        }
        for(auto i=k.begin();i!=k.end();i++)
        {
            m.push_back(i->second);
        }
        return m;
    }
};

int main() {
    vector<string>s={"eat", "tea", "tan", "ate", "nat", "bat"};
    vector<vector<string>>j;
	Solution soln;
	j=soln.groupAnagrams(s);
	for(int i=0;i<j.size();i++)
	{
	    for(int m=0;m<j[i].size();m++)
	    {
	        if(m==j[i].size()-1)
	            cout<<j[i][m];
	        else
	            cout<<j[i][m]<<',';
	    }
	    cout<<"\n";
	}
	return 0;
}