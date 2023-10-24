// Same as Isomorphic
// TC O(n)
// SC O(1)

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character,String> sToT= new HashMap<>();
        Set<String> tSet= new HashSet<>();

        for(int i=0; i<pattern.length(); i++){
            char sChar= pattern.charAt(i);
            String tString= words[i];
            if(sToT.containsKey(sChar)){
                if(!sToT.get(sChar).equals(tString)){
                    return false;
                }
            }else{
                if(tSet.contains(tString)){
                    return false;
                }
                sToT.put(sChar,tString);
                tSet.add(tString);
            }
        }
        return true;
    }
}