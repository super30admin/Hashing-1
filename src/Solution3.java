import java.util.HashMap;

public class Solution3 {
	 public boolean wordPattern(String pattern, String s) {
	       String []words=  s.split("");
	       HashMap<String,Character> wordtocharac =new HashMap<>();
	       HashMap<Character,String> charactoword =new HashMap<>();
	       for(int i=0;i<=pattern.length();i++) {
	    	 char[]c = pattern.charAt(i);
	            String w = words[i];
	            if (charactoword.containsKey(c)) {
	            	if(charactoword.get(c).equals(w)) {
	            		return false;
	            	}
	            }
	            charactoword.put(c, w);
	            if (wordToChar.containsKey(w)) {
	                if (wordToChar.get(w) != c) {
	                    return false;
	                }
	            } else {
	                wordToChar.put(w, c);
	            }
	        }

	        return true;

	       }
	       
	    }

}
