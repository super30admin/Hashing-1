/*
 * Approach: I will using a HashMap to map each char from the pattern to the word.
 * loop through and return false in case : key exists and value doesnt or vice versa.
 * T.C:  O(n) length of the pattern.
 * S.C: O(n) length of the string array used to store extracted words from the original string.
 *  
*/

class wordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String str[] = null;
        str = s.split(" ");

        if(pattern.length() != str.length) return false;

        for(int i = 0; i< pattern.length(); i++){
            char c = pattern.charAt(i);

            if(!map.containsKey(c)){
                if(map.containsValue(str[i])) return false;
                map.put(c, str[i]);
            }else{
                if(!map.get(c).equals(str[i])) return false;
            }
        }
     return true;
    }
}