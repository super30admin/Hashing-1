class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[]=s.split(" ");
        if(words.length!=pattern.length()){
            return false;
        }
        HashMap<Character,String>store=new HashMap<>();
        HashSet<String>storage=new HashSet<>();

        for(int i=0;i<words.length;i++){
            
            char ss=pattern.charAt(i);
            if(store.containsKey(ss)){
                if(!(store.get(ss).equals(words[i])))
                    return false;
            }else{
                if(storage.contains(words[i])){
                    return false;
                }store.put(ss,words[i]);
                storage.add(words[i]);
            }
        }
    return true;
    }
}
