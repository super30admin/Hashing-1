//time = 1ms (faster than 98% submissions)
//Space = 42.7 MB (Less than 86% submissions)

//I have 1 double : what's the different between below 2 statements?:

//  x.equals(y)
// x == y

// when I used x.equals(y) in the below commented statement in the code, the program worked fine but as soon
//as I replaced it with x == y, I face error

class Solution {
    public boolean wordPattern(String pattern, String s) {

        Map<Character, String> map_p = new HashMap<>();

        Map<String, Character> map_s = new HashMap<>();

        String[] arr = s.split(" ");

        if (pattern.length() != arr.length) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {

            if (!map_p.containsKey(pattern.charAt(i))) {

                if (map_s.containsKey(arr[i])) {
                    return false;
                } else {
                    map_p.put(pattern.charAt(i), arr[i]);
                    map_s.put(arr[i], pattern.charAt(i));
                }

            } else {
                String word = map_p.get(pattern.charAt(i));
                // This line below
                if (!word.equals(arr[i])) {
                    return false;
                }
            }
        }
        return true;

    }
}