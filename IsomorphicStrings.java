package day6;

import java.util.HashMap;

public class IsomorphicStrings {
	public static boolean isIsomorphic(String s, String t) {
		HashMap<Character, Character> s_map = new HashMap<>();
		HashMap<Character, Character> t_map = new HashMap<>();
		char[] s_array = s.toCharArray();
		char[] t_array = t.toCharArray();

		for (int i = 0; i < s_array.length; i++) {
			if (!s_map.containsKey(s_array[i])) {
				s_map.put(s_array[i], t_array[i]);
				if(!t_map.containsKey(t_array[i]))
					t_map.put(t_array[i], s_array[i]);
				else
					return false;
			}
			else {
				char value1 = s_map.get(s_array[i]);//d
				if (value1 != t_array[i]) {
					return false;
				}
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
