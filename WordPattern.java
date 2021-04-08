/*

Thought process: We need to map the pattern characters with s words. So we need a hashmap for it. Next to not insert duplicate values on hashmap
we need to have a hashset to see if the value already existed.

T.C -> O(N)
S.C -> O(N)
*/

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        
        // Googled to split the string
        String[] strArr = s.split(" ");
        if(strArr.length != pattern.length()) return false;
        
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        
        for(int i=0; i<strArr.length; i++){
            // Mistake made -> String Equality checked with == instead of .equals
            if(map.containsKey(pattern.charAt(i)) && !map.get(pattern.charAt(i)).equals(strArr[i])) return false;
            
            if(!map.containsKey(pattern.charAt(i)) && set.contains(strArr[i])) return false;
            map.put(pattern.charAt(i), strArr[i]);
            set.add(strArr[i]);
        }
        return true;
    }
}