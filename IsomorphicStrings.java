class IsomorphicStrings {
    
    private HashMap<Character, Character> myHashMap = new HashMap<>();
    private HashSet<Character> myHashSet = new HashSet<>();
    public boolean isIsomorphic(String s, String t) {
        //SanityCheck
        
        if(s == null || t == null || s.length() == 0 || t.length() == 0) {
            if(s.length() == 0 && t.length() == 0)
                return true;
            else
                return false;
        }
        
        for(int i =0 ;i <s.length(); i ++){
            if(myHashMap.get(s.charAt(i)) == null){
            	myHashMap.put(s.charAt(i), t.charAt(i));
            	if(myHashSet.add(t.charAt(i))){
            		continue;
            	}else{
            		return false;
            	}
            } else{
                if(myHashMap.get(s.charAt(i)) == t.charAt(i)){
                	continue;
                }else{
                	return false;
                }
            }
        }
        return true;
        
    }
}