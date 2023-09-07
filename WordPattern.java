//Time complexity is O(nk) and space complexity is O(n)
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if(str.length != pattern.length())
            return false;

        HashMap<Character, String> hash = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for(int i=0; i<pattern.length(); i++){
            if(!hash.containsKey(pattern.charAt(i))){
                hash.put(pattern.charAt(i), str[i]);
                if(set.contains(str[i])){
                    return false;
                }
                set.add(str[i]);
            }
            else{
                if(!hash.get(pattern.charAt(i)).equals(str[i]))
                    return false;
            }
        }

        return true;
    }
}
