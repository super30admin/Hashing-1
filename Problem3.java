
o(n) time complexity
O(2n) space complexity for hashmap and hashset

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        if(words.length != pattern.length()){
            return false;
        }
        for(int i = 0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(words[i])){
                     return false;
                }
            } else {
                if(set.contains(words[i])){
                    return false;
                }
            }

            set.add(words[i]);
            map.put(ch, words[i]);
        }
        return true;

    }
}
