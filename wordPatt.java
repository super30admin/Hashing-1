//Time Complexity: O(lk) | l is the number of characters in the String pattern and k is the number of characters in the String (for add in HashSet)
//Space Complexity: O(lk) | l is the number of unique characters and k is the length of the String
//Program ran successfully, I made a minor mistake of using == for String comparision instead of the equals method
/*
    Algortihm: 1. First convert the String s in into a string array
               2. Check if the the length of the array  != length of the String pattern return false
               3. Create a HashMap that maps a character to a String and declare a HashSet that holds Strings
               4. Traverse the array and characters of String pattern
               5. If key exists(character at i of String pattern), check if corresponding String value is equal to String at arr[i]
               6. If not equal return false
               7. If key does not exist, add the String at arr[i] in the hashset. If hashset add is false(i.e value is mapped previously) return false
               8. Else put the character at i in String pattern as the key and String at arr[i] at value 
*/
class wordPatt {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(arr.length != pattern.length()) return false;
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            char c = pattern.charAt(i);
            String temp = map.get(c);
            if(temp == null){
                if(!set.add(arr[i])){
                    return false;
                }else{
                    map.put(c,arr[i]);
                }
            }
            else{
                if(!map.get(c).equals(arr[i])){
                    return false;
                }
            }        
        }
         return true;
    }
}
