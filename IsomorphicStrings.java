// Time Complexity :O(n), n= no. of letterss in string s
// Space Complexity :O(2n)=> O(n)
// Did this code successfully run on Leetcode : yes

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        //map to strore unique combination of s to t
        HashMap<Character, Character> mapS = new HashMap<>();
        //map to strore unique combination of t to s
        HashMap<Character, Character> mapT = new HashMap<>();
        //looping through all letters
        for(int i=0; i< s.length(); i++){
            // get current s
            char sChar = s.charAt(i);
            // get current t
            char tChar = t.charAt(i);
            //if s map doesn't contain current s
            if(!mapS.containsKey(sChar)){
                //add current s
                mapS.put(sChar, tChar);
            }// if s map has current s
            else{
                //check if t value corresponding to current s is same as current t
                if(mapS.get(sChar)!=tChar) return false;
            }
            //if t map doesn't contain current t
            if(!mapT.containsKey(tChar)){
                //add current t
                mapT.put(tChar, sChar);
            }// if t map has current t
            else{
            //check if s value corresponding to current t is same as current s
                if(mapT.get(tChar)!=sChar) return false;
            }

        }
        //if everything matches
        return true;
    }
}