// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : Yes, intution

class Problem2 {
    public boolean isIsomorphic(String s, String t) {
        //using hashmap
        //we use two hashmaps for checking either keys and values
        HashMap<Character,Character> hm = new HashMap<>();
        HashMap<Character,Character> rev = new HashMap<>();
        boolean ans = true;
        //intially booolean is true
        for(int i=0;i< s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            //if the key doesnot contain in the hashmap add them!
            if(!hm.containsKey(ch1) && !rev.containsKey(ch2)){
                hm.put(ch1,ch2);
                rev.put(ch2,ch1);
            }
            //if s and t are not directing to same value then return false!
            else if(hm.containsKey(ch1) && hm.get(ch1)!= ch2){
                ans = false;
                break;
            }else if(rev.containsKey(ch2) && rev.get(ch2)!= ch1){
                ans = false;
                break;
            }
        }
        return ans;
    }
}