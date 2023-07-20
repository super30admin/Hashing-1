class Solution {
public:
    bool isIsomorphic(string s, string t) {

        map<char,char>st;
        map<char,char>ts;

        for(int i = 0 ;i<s.length();i++){
            char schar = s[i];
            char tchar = t[i];
            cout<<" " << schar;
            if(st.find(s[i]) == st.end()){
                st[s[i]] = t[i];
            }else{
                if(st[s[i]] !=  tchar){
                        return false;
                }
            }
            
            
            
            if(ts.find(t[i]) == ts.end()){
                ts[t[i]] = s[i];
            }else{
                if(ts[t[i]]!=schar){
                    return false;
                }
            }

            

        }

        return true;
        
    }
};