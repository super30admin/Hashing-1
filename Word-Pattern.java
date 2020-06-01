class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> hm=new HashMap<>();
        String st[]=str.split(" ");
        if(pattern.length()!=st.length){
            return false;
        }
        if(pattern==null && str==null){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            String s=st[i];
            char ch=pattern.charAt(i);
            if(hm.containsKey(ch)){
                if(!hm.get(ch).equals(s))
                    return false;
            }else if(hm.containsValue(s)){
                    return false;
                }
                hm.put(ch, s);
            }
        return true;
    }
}
