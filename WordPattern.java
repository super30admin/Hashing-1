class WordPattern {
    //Time Complexity - o(n)
    //Space Complexity - o(1)
    public boolean wordPattern(String pattern, String s) {    
        String[] strArray = s.split("\\s+"); 
        if(pattern.length() != strArray.length){
            return false;
        } 
        Map<Character,String> pToSmap = new HashMap<Character,String>();
        
        Map<String,Character> sToPmap = new HashMap<String,Character>();
        
		for (int i = 0; i < pattern.length(); i++) {
			
			if(pToSmap.containsKey(pattern.charAt(i))) {
				if(!pToSmap.get(pattern.charAt(i)).equals(strArray[i])){
					return false;
				}
			} else {
				pToSmap.put(pattern.charAt(i), strArray[i]);
			}
			
			if(sToPmap.containsKey(strArray[i])) {
				if(sToPmap.get(strArray[i]) != pattern.charAt(i)){
					return false;
				}
			} else {
				sToPmap.put(strArray[i], pattern.charAt(i));
			}
		}
        return true;
    }
}