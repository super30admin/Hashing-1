
// Time Complexity : O(n*m) n numer of strings , m length of strings 
// Space Complexity : O(n) hashmap making for each string. 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
   // change each string to count chars  like 
        // abbcc will become 122000000... till 26 
// did it before class so did not follow the prime product answer... but above approach.


class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
     
        vector<string> aplhastrs;
        for( int i=0; i< strs.size(); i++){
            vector<int>counts {0};
            counts.resize(26);
            for( int x=0; x< strs[x].length(); x++ ){
                int pos = strs[i][x] - 'a';
                counts[pos]++;
            }
            // make 122000000...
            string alphastr = "";
            for( int z=0; z< counts.size(); z++ ){
                string temp = to_string( counts[z] );
                alphastr += temp;
            }
            aplhastrs.push_back( alphastr );
        }
        
        unordered_map<string,vector<string>> strpos;
        for( int i=0; i< aplhastrs.size(); i++ ) {
            if( strpos.find(aplhastrs[i]) == strpos.end()){
               vector<string>temp;
               temp.push_back( strs[i] );
               strpos[aplhastrs[i]] = temp;
            } else {
               auto vecalready =  strpos[aplhastrs[i]];
               vecalready.push_back( strs[i] );
               strpos[aplhastrs[i]] = vecalready;
            }
        }
        
        vector<vector<string>> answer;
        for(auto it=strpos.begin();it!=strpos.end();it++) {
          answer.push_back(it->second); 
        }
        return answer;
    }
};
