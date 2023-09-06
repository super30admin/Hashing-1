

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        //one hashmap and one hashset
        String[] strings = s.split(" ");
        java.util.HashMap<Character, String> patternMap = new java.util.HashMap<>();
        java.util.HashSet<String> values = new java.util.HashSet<>();
        if(pattern.length() != strings.length) return false;
        for (int i = 0; i < pattern.length(); i++) {
            if(!patternMap.containsKey(pattern.charAt(i))) {
                patternMap.put(pattern.charAt(i), strings[i]);
                boolean isAdded = values.add(strings[i]);
                if(!isAdded) return false;
            } else {
                if(!(patternMap.get(pattern.charAt(i)).equals(strings[i]))) return false;
            }
        } return true;
    }
}
