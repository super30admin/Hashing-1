// Time Complexity : O(N) N is #of stings 
// Space Complexity : O(M) M is # of groups
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : unable to figure out #rows for first loop 


// Your code here along with comments explaining your approach:
// 1. Loop array of strings and sort each string to chk if its set exist or not.
// 2. If not exist add this to a map with its index for 2d array.
// 3. Else add to existing index.

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        map<string,int> m;
        int n=strs.size(),rows=1;
        vector<vector<string>> ans;
        for(int i=0;i<n;i++){
            string s=strs[i];
            sort(s.begin(),s.end());
            //cout<<s<<' ';
            if(m[s]){
                ans[m[s]-1].push_back(strs[i]);
            }
            else{
                vector<string> t;
                t.push_back(strs[i]);
                ans.push_back(t);
                m[s]=rows;rows++;
            }
        }
        return ans;
    }
};