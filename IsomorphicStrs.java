// Check if two strings are isomorphic or not

// Time-Complexity-O(n) 
// Space Complexity-O(n)
// passed test cases on leetcode-yes
// faced problem-no

class IsomorphicStrs {
    public boolean isIsomorphic(String s, String t) {
        
        //the question can be deduced as there should a unique key and value pairs.
        
        //creating a hashmap for every character to it's same position character of second array
        Map<Character,Character> hm=new HashMap<Character,Character>();
        char s1=' ';
        char s2=' ';
        
        for(int i=0;i<s.length();i++){
           s1=s.charAt(i);
           s2=t.charAt(i);
           
            //if the hashmap already contains a value and its key is a new one, then returning false as it violates rule, i.e a can have only b as value, and b should have only a as it's key;
           if(hm.containsValue(s2) && !hm.containsKey(s1)){
               return false;
           }
           
            //if hashmap already contains a key and it's new value is a new entry 
           if(hm.containsKey(s1)){
               if(s2!=hm.get(s1)) return false;
           }
            
           //if hashmap does not have current character of string one as key and current character of string2 as value then add to the hashmap which means a new entry 
           else
           hm.put(s1,s2);
       }
        return true;
}
}
