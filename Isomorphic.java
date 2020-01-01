package com.exmaple.problems;

import java.util.*;

public class Isomorphic {

	public boolean isIsomorphic(String s, String t) {

		Map<Character, Character> map1 = new HashMap<>();
		Map<Character, Character> map2 = new HashMap<>();

		if (s.length() != t.length())
			return false;
		int size = s.length();

		for (int i = 0; i < size; i++) {
			char sChar = s.charAt(i);
			char tChar = t.charAt(i);

			if (!map1.containsKey(sChar)) {
				map1.put(sChar, tChar);
			} else {
				if (!map1.get(sChar).equals(tChar))
					return false;
			}

			if (!map2.containsKey(tChar)) {
				map2.put(tChar, sChar);
			} else {
				if (!map2.get(tChar).equals(sChar))
					return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		String s = "foo", t = "bar";
		Isomorphic iso = new Isomorphic();
		System.out.print(iso.isIsomorphic(s, t));
	}

}
