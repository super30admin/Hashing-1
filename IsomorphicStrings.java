package day6;

import java.util.HashMap;

public class IsomorphicStrings {
	public static boolean isIsomorphic(String s, String t) {
		HashMap<Character, Character> s_map = new HashMap<>();
		HashMap<Character, Character> t_map = new HashMap<>();
		if (s.length() != t.length())
			return false;
		for (int i = 0; i < s.length(); i++) {
			char key = s.charAt(i);
			char value = t.charAt(i);
			if (!s_map.containsKey(key)) {
				s_map.put(key, value);
				if (!t_map.containsKey(value))
					t_map.put(value, key);
				else
					return false;
			} else {
				if (s_map.get(key) != value)
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ab";
		String str2 = "aa";
		Boolean output = isIsomorphic(str1, str2);
		System.out.println(output);

	}

}
