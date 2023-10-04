import java.util.HashMap;

public class IsoMorphic {
	public static boolean isIsomorphic(String s, String t) {
		if(s.length()!=t.length())return false;
		HashMap<Character,Character> h1 = new HashMap<>();
		HashMap<Character, Character> h2 = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(h1.get(s.charAt(i))==null) {
				h1.put(s.charAt(i),t.charAt(i));
			}else {
				if(h1.get(s.charAt(i))!= t.charAt(i)) return false;
			}
			
			if(h2.get(t.charAt(i))==null) {
				h2.put(t.charAt(i),s.charAt(i));
			}else {
				if(h2.get(t.charAt(i))!= s.charAt(i)) return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isIsomorphic("egg","add"));
		System.out.println(isIsomorphic("foo","bar"));
		System.out.println(isIsomorphic("paper","title"));

	}

}