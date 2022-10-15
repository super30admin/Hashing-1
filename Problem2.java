//time = 16ms (faster than 55% submissions)
//Space = 42.7 MB (Less than 76% submissions)

class Solution {
    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> map = new HashMap<>();

        List<Character> list = new ArrayList<>();

        if (s.length() == t.length()) {

            for (int i = 0; i < s.length(); i++) {

                if (!map.containsKey(s.charAt(i))) {

                    if (list.contains(t.charAt(i))) {
                        return false;
                    } else {
                        map.put(s.charAt(i), t.charAt(i));
                        list.add(t.charAt(i));
                    }

                }

                else {
                    if (map.get(s.charAt(i)) != t.charAt(i)) {
                        return false;
                    }
                }

            }

            return true;

        } else {
            return false;
        }
    }
}