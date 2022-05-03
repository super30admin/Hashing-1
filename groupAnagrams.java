// O(w*n) | O(wn) where w is the number of words and n is the length of the longest word


class Solution{
public static List<List<String>> groupAnagrams(List<String> words) {
    
		Map<String , List<String>> anagrams = new HashMap<String, List<String>>();
		
		for (String word : words){
	
				char[]  charArray = word.toCharArray();
				Arrays.sort(charArray);
				String sortedWord= new String (charArray);
			if(anagrams.containsKey(sortedWord)){
				anagrams.get(sortedWord).add(word);
			}else{
				anagrams.put(sortedWord, new ArrayList<String>(Arrays.asList(word)));
				
			}
			
		}
		
    return new ArrayList<>(anagrams.values());
  }
  
}
