//205. Isomorphic Strings

/*
Hash map each char of s to char of t in iso
Hash map each char of t to char of s in iso1
if there is no pre-existing mapping, add it
If there is already mapping to another char return false - we conclude s and t are not isomorphic
*/

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        int s1 = s.length();
        int t1 = t.length();
        unordered_map<char,char> iso, iso1;
        if(s1 != t1) return false;
        if(s1 == t1){
            for(int i = 0; i<s1; i++)
            {
                char c1 = s[i];
                char c2 = t[i];

                //map it
                if(iso.find(c1) == iso.end() && iso1.find(c2) == iso1.end())
               {
                   iso[c1] = c2;
                   iso1[c2] = c1;
               }
                //check for mapping
               else{
                   if(iso[c1] != c2 && iso1[c2] != c1){
                       return false;
                   }
               }
            }



        }
        //else return false;
        return true;



    }
};