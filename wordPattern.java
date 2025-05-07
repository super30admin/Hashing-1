class Solution {
    //Time complexity:O(n)
    //Space complexity:O(n)
    public boolean wordPattern(String pattern, String s) {
        String[] strs=s.split(" ");
        if(pattern.length()!=strs.length){
            return false;
        }
        Map<Character,String> pMap=new HashMap<>();
        Map<String,Character> sMap=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char pChar=pattern.charAt(i);
            String str=strs[i];
            if(pMap.containsKey(pChar)){
                if(!pMap.get(pChar).equals(str)){
                    return false;
                }
            }
            else{
                pMap.put(pChar,str);
            }
            if(sMap.containsKey(str)){
                if(sMap.get(str)!=pChar){
                    return false;
                }
            }
            else{
                sMap.put(str,pChar);
            }
        }
        return true;
    }
}