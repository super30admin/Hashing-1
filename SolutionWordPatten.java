class SolutionWordPatten {
    public boolean wordPattern(String pattern, String s) {
        String[] split = s.split("\\s+");
        HashSet<String> set = new HashSet<>();
        HashMap<Character,String> hm = new HashMap<>();
        
        if(pattern.length()!=split.length){
            return false;
        }
        
        for(int i = 0; i < pattern.length(); i++){
            if(hm.containsKey(pattern.charAt(i))){
                if(!hm.get(pattern.charAt(i)).equals(split[i])){                 
                    return false;
                }
            }else{
                if(set.contains(split[i])){
                    return false;
                }else{
                    hm.put(pattern.charAt(i),split[i]);
                    set.add(split[i]);
                }
            }
        }
        
        return true;
    }
}
