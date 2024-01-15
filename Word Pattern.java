// O(n) time and O(n) space
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] string = s.split(" ");
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>(); 

        if(pattern.length() != string.length) return false;

        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String x = string[i];
            if(map.containsKey(c)){
                if(!map.get(c).equals(x)) return false;
            } else {
                if(set.contains(x)) return false;
                map.put(c,x);
                set.add(x);
            }
        }

        return true;
    }
}
