
//Time: O(len(pattern) + len(s))
// Space: O(unique chars in (pattern+string))

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap map = new HashMap<>();
        HashMap map2 = new HashMap<>();
        String[] strArray= s.split(" ");
        if(pattern.length() != strArray.length)
            return false;

        for(int i = 0 ; i < pattern.length(); i++){
            char ch = pattern.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,i);

            }
            if(!map2.containsKey(strArray[i])){
                map2.put(strArray[i],i);

            }
            if(!map.get(ch).equals(map2.get(strArray[i])))
                return false;
            
        }
        return true;
    }
}