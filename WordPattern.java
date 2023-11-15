// Time Complexity: O(n)
// Space Complexity: O(1)

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        if(pattern == null || s == null) throw new IllegalArgumentException();

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        String[] stringArr = s.split("\\s+");
        char[] charArr = pattern.toCharArray();


        if(stringArr.length != charArr.length) return false;

        for(int i = 0; i < charArr.length; i++){
            var str = stringArr[i];
            var c = charArr[i];

            if(!map.containsKey(c)){
                if(set.contains(str)) return false;
                map.put(c, str);
                set.add(str);
            }
            else{
                if(!(map.get(c).equals(str))) return false;
            }
        }
        return true;
    }
}
