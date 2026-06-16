//Approach: Use a HashMap to store the frequency of each character in the string. Then, iterate through the string again and check if the frequency of the character is 1. If it is, return that character. If no such character is found, return a message indicating that there are no unique characters.
public class solution {
    public static char firstUniqueChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : s.toCharArray()) {
            if (map.get(c) == 1) 
            {
                return c;
            }
        }
        return '\0'; 
    }
}
