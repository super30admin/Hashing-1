// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes


class isomorphicStrings {
      public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        // 2 character arrays 
        char[] sMap= new char[100];
        char[] tMap= new char[100];
        
        for(int i=0; i<s.length();i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(sMap[sChar - ' ']!=0){
                if(sMap[sChar - ' ']!= tChar){
                    return false;
                }
            }
            else{
                sMap[sChar - ' ']= tChar;
            }
            if(tMap[tChar - ' ']!=0){
                if(tMap[tChar - ' ']!= sChar){
                    return false;
                }
            }
            else{
                tMap[tChar - ' ']= sChar;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        isomorphicStrings rs = new isomorphicStrings();
        System.out.println(rs.isIsomorphic("egg","add"));  // ans = true
        System.out.println(rs.isIsomorphic("foo","bar"));  // ans = false
    }

}