//Time complexity: O(l) | Here l is the length of the String s and t.
//Space Compleixty: O(2l) | Here l is the number of unique characters in the String s and t
//Program ran successfully
/*
    Algorithm: 1. Check if the length of both strings is equal, if not, return false
               2. Declare a HashMap that maps character to character and a HashSet that holds Characters
               3. Traverse the Strings character by character
               4. If the map already contains the character in String s, then check if the corresponding value is equal to the character at i in String t
               5. If not equal return false
               6. If map does not contain the key, add the character at i in String t to a hashset, if the value has already been mapped, return false
               7. Else put character in String s as the key and the character in the String t as the value
               8. return true
*/
class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(map.containsKey(schar)){
                if(map.get(schar) != tchar){
                    return false;
                }
            }else{
                if(!set.add(tchar)){
                    return false;
                }else{
                    map.put(schar,tchar);
                }
            }
        }
        return true;
    }
}
