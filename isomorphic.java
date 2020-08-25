import java.util.HashMap;

public class isomorphic {
	
	public boolean isomorphic_string(String s, String t) {
		
		if(s.length()!=t.length())
			return false;
		HashMap<Character, Character> map = new HashMap();
		
		for(int i=0;i<s.length();i++) {
			
			if(map.containsKey(s.charAt(i))) {
				if(map.get(s.charAt(i))==t.charAt(i))
					continue;
				else 
					return false;
			}
			if(map.containsValue(t.charAt(i)))
				return false;
			map.put(s.charAt(i), t.charAt(i));
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		isomorphic is = new isomorphic();
		System.out.println(is.isomorphic_string("ab","aa"));
	}

}
