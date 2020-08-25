import java.util.*;

public class word_pattern {
	
	public boolean WordPattern(String pattern, String str) {
		
		String[] strArr = str.split(" ");
		if(strArr.length!=pattern.length())
			return false;
		HashMap<Character, String> pMap = new HashMap();
		HashMap<String, Character> sMap = new HashMap();
		
		
		for(int i=0;i<pattern.length();i++) {
			
			if(!pMap.containsKey(pattern.charAt(i))) {
				pMap.put(pattern.charAt(i), strArr[i]);
			}
			else
				if(!pMap.get(pattern.charAt(i)).contentEquals(strArr[i]))
					return false;
			
			if(!sMap.containsKey(strArr[i]))
					sMap.put(strArr[i], pattern.charAt(i));
			else
				if(!sMap.get(strArr[i]).equals(pattern.charAt(i)))
					return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		word_pattern wp = new word_pattern();
		System.out.println(wp.WordPattern("abbs", "dog cat cat dog"));
	}

}
