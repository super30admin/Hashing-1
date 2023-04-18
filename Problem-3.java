//tc=O(nk)
//sc=O(n)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArray=s.split(" ");
        if(strArray.length!=pattern.length()){
           return false; 
        }
        //One hashmap and one hashset
        HashMap<Character,String> map=new HashMap<>();
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String str=strArray[i];
            if(map.containsKey(c)){
                if(!map.get(c).equals(str)){
                    return false;
                }
            }
            else{
                if(set.contains(str)){
                    return false;
                }
                set.add(str);
                map.put(c,str);
            }
        }
        return true;
    }
}