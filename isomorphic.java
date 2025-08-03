/** Time Complexity: O(N) where N is the length of the strings.
* Space Complexity: O(1) since the size of the character arrays is constant (256).
* Did this code successfully run on Leetcode? Yes 
* Any problems faced? No
*/
/** The program uses two character arrays to map characters from one string to another.
 *  The arrays are chosen instead of the Hashmaps/Hashsets to optimize by reducing the overhead of collision handling and resizing as anyway the size of the character set is constant (256).
 *  The smap array maps character array stores the ASCII value of corresponding tmap character in the same index.
 *  The tmap array does the reverse mapping and if the mapping is not consistent i.e., already mapped to a different character, it returns false.*/
class isomorphic {
    public boolean isIsomorphic(String s, String t) {

        if(s==null || t==null) return false;
        if(s.length()!=t.length()) return false;

        char[] smap=new char[256];
        char[] tmap=new char[256];
        
        for (int i=0;i<=s.length()-1;i++)
        {
            char schar=s.charAt(i);
            char tchar=t.charAt(i);

            if(smap[schar]==0)
            {
                smap[schar]=tchar;
            }
            else
                if (smap[schar]!=tchar) return false;

             if(tmap[tchar]==0)
            {
                tmap[tchar]=schar;
            }
            else
                if(tmap[tchar]!=schar) return false;
        }
        return true;
        
    }
}