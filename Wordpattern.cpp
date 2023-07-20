class Solution {
public:
    bool wordPattern(string pattern, string s) {



    
              map<char,string> ts;  
              map<string,char> sp;  
        string str = s;
          string st;
    stringstream ss(str);

  vector<string> v;
 
    while (getline(ss, st, ' ')) {
        v.push_back(st);
    }
 

        if(pattern.length() != v.size()){
            return false;
        }
          
        
        for(int i=0;i<pattern.length();i++){
            char c = pattern[i];
            if(ts.find(c) == ts.end()){
                ts[pattern[i]] = v[i];
            }else{
                if(ts[pattern[i]] != v[i])
                {
                    return false;
                }
            }

            }

           for(int i=0;i<pattern.length();i++){
            string c = v[i];
            if(sp.find(c) == sp.end()){
               
                sp[v[i]] = pattern[i];
            }else{
                if(sp[v[i]]!=pattern[i])
                {
                    return false;
                }      
             }       
        }

      return true;
        }
};