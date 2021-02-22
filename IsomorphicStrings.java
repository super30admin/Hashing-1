// 1st approach
// TC - O(n), SC - O(n)
class Solution {
    public boolean isIsomorphic(String s, String t) {
		
		// comparing length of s and t, if not equal return false
        if(s.length() != t.length()){
            return false;
        }
        
		// Two hash maps, one from s to t and other comparing t to s
        Map<Character, Character> sToTMap = new HashMap<>();
        Map<Character, Character> tToSMap = new HashMap<>();
        
		// Iterate through s and t , 0 -> s.length()-1
        for(int i=0; i<s.length(); i++){
            
			// Storing characters from s and t at ith index
            char c = s.charAt(i);
            char d = t.charAt(i);
            
			// if s to t map contains c as key, check if value of c is not equals to d, if yes return false
            if(sToTMap.containsKey(c)){
                if(sToTMap.get(c) != d){
                    return false;
                }
			// if s to t map does not contain c as key, put the c and d into the s to t map
            }else{
                sToTMap.put(c, d);
            }
            
			// if t to s map contains d as key, check if value of d is not equals to c, if yes return false
            if(tToSMap.containsKey(d)){
                if(tToSMap.get(d) != c){
                    return false;
                }
			// if t to s map contains d as key,, put the d and c as key, value pair in tToSMap
            }else{
                tToSMap.put(d, c);
            }
            
        }
        
		// If everything goes through above loop, retun true
        return true;
        
    }
}

// 2nd approach
// 0(n^2), as we are using map.containsValue()
// class Solution {
//     public boolean isIsomorphic(String s, String t) {
        
//         Map<Character, Character> map = new HashMap<>();
        
//         for(int i=0; i<s.length(); i++){
//             char a = s.charAt(i);
//             char b = t.charAt(i);
//             if(!map.containsKey(a)){
//                 if(!map.containsValue(b)){
//                     map.put(a, b);    
//                 }else{
//                     return false;
//                 } 
//             }else{
//                 if(!map.get(a).equals(b)){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
// }