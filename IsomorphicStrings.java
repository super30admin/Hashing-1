// Time Complexity : O(n) where n is length of the string
// Space Complexity : O(1) Size of the array is constant.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Here we create two char arrays to maintain s -> t & t -> s mapping respectively.
// Each and every time we iterate the string, we check if the char mapping is present in the string. 
// If mapping exists we check wether the mapped value matches to the incoming value. 
// Return false if there is mis match of the mapped value and the incoming value.
// If the mapping doesn't exist then we update the mapping.

class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] smap = new char[100];
        char[] tmap = new char[100];
        
        for(int i = 0; i < s.length(); i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            
            if(smap[schar - ' '] == 0){
                smap[schar - ' '] = tchar;
            }else{
                if(smap[schar - ' '] != tchar) return false;
            }
            
            if(tmap[tchar - ' '] == 0){
                tmap[tchar - ' '] = schar;
            }else{
                if(tmap[tchar - ' '] != schar) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
    }
}