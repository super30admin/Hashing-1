// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String str[] = s.split(" ");
        if(pattern.length() != str.length) return false;

        String map[] = new String[26];
        Set<String> set = new HashSet<>();

        for(int i = 0; i< pattern.length(); i++){
            char pc =pattern.charAt(i);
            if(map[pc - 'a'] != null){
                if(!map[pc - 'a'].equals(str[i])) return false;
            }else if(set.contains(str[i])) return false;
            else{
                map[pc - 'a'] = str[i];
                set.add(str[i]);
            }
        }
        return true;
    }
}