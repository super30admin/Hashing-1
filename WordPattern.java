// TC - O(n), SC - O(n)

class Solution {
     public boolean wordPattern(String pattern, String s) {
        
		// Two hash maps, one from pattern to s and other comparing s to pattern
         Map<Character, String> mapPToS = new HashMap<>();
         Map<String, Character> mapSToP = new HashMap<>();
		 
		 // Splitting the string s into words and storing them into arr by using split() method
         String[] arr = s.split(" ");
         
		 // Check if pattern length and arr length, if not equal, return false
         if(pattern.length() != arr.length){
             return false;
         }
         
		 // Iterating through length of pattern or arr
         for(int i=0; i<pattern.length(); i++){
             
			 // Storing pattern word and arr at index i to c and w
             char c = pattern.charAt(i);
             String w = arr[i];
             
			 // if mapPToS contains c as key, check if value of c is not equals to w, if yes return false
             if(mapPToS.containsKey(c)){
                 if(!mapPToS.get(c).equals(w)){
                     return false;
                 }
			 // if mapPToS does not contain c as key, put the c and w into the mapPToS
             }else{
                 mapPToS.put(c, w);
             }
             
			 // if mapSToP contains w as key, check if value of w is not equals to c, if yes return false
             if(mapSToP.containsKey(w)){
                 if(!mapSToP.get(w).equals(c)){
                     return false;
                 }
			 // if mapSToP contains w as key,, put the w and c as key, value pair in mapSToP
             }else{
                 mapSToP.put(w, c);
             }
             
         }
		 // If everything goes through above loop, retun true
         return true;
     }
}

// class Solution {
//     public boolean wordPattern(String pattern, String s) {
//         String[] arr = s.split(" ");
//         if(arr.length != pattern.length()){
//             return false;
//         }
//         Map<Character, String> map = new HashMap<>();
//         for(int i=0; i<pattern.length(); i++){
//             char c = pattern.charAt(i);
//             String w = arr[i];
//             if(map.containsKey(c)){
//                 if(!map.get(c).equals(w)){
//                     return false;
//                 }
//             }else{
//                 if(!map.containsValue(w)){
//                     map.put(c, w);
//                 }else{
//                     return false;
//                 }
//             }
//         }
//         map.forEach((k, v) -> System.out.println(k + " : " + v)); 
//         return true;
//     }
// }

