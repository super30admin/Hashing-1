/* Problem 1:
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : yes
*/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;

        Map<Character,Character> hashMap1 = new HashMap<>();

        Map<Character,Character> hashMap2 = new HashMap<>();

        for(int i=0;i<s.length();i++){

            if((hashMap1.containsKey(s.charAt(i)) 
            && hashMap1.get(s.charAt(i))!= t.charAt(i)) ||
            (hashMap2.containsKey(t.charAt(i)) 
            && hashMap2.get(t.charAt(i))!= s.charAt(i))){
                return false;
            }else{
                hashMap1.put(s.charAt(i),t.charAt(i));
                 hashMap2.put(t.charAt(i),s.charAt(i));

            }
        }
        return true;
    }
}
//2 pass hashmap implementation
// class Solution {
//     public boolean isIsomorphic(String s, String t) {

//         if(s.length()!=t.length()) return false;

//         Map<Character,Character> hashMap1 = new HashMap<>();

//         Map<Character,Character> hashMap2 = new HashMap<>();


//         for(int i=0;i<s.length();i++){

//             if(hashMap1.containsKey(s.charAt(i)) 
//             && hashMap1.get(s.charAt(i))!= t.charAt(i)){
//                 return false;
//             }else{
//                 hashMap1.put(s.charAt(i),t.charAt(i));
//             }
//         }

//         for(int i=0;i<t.length();i++){

//             if(hashMap2.containsKey(t.charAt(i)) 
//             && hashMap2.get(t.charAt(i))!= s.charAt(i)){
//                 return false;
//             }else{
//                 hashMap2.put(t.charAt(i),s.charAt(i));
//             }
//         }
//         return true;
        
//     }
// }