// Approach:
// Sort each string and use the sorted string as a key in a HashMap.
// Strings having the same sorted form are anagrams and are grouped together.
// Finally, return all groups stored in the HashMap.

// Time Complexity: O(N * K log K)
// Space Complexity: O(N * K)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}//problem 2
// Approach:
// Use two HashMaps to maintain character mappings in both directions.
// For every character, verify that the existing mappings remain consistent.
// If any mismatch occurs return false, otherwise return true.

// Time Complexity: O(N)
// Space Complexity: O(1)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int m=s.length();
        int n=t.length();
        HashMap<Character,Character> t1=new HashMap<>();
        HashMap<Character,Character> t2=new HashMap<>();
        for(int i=0;i<m;i++){
            char ch=s.charAt(i);
            char ch2=t.charAt(i);
            if(t1.containsKey(ch) && t1.get(ch)!=ch2){
                return false;
            }
            if(t2.containsKey(ch2) && t2.get(ch2)!=ch){
                return false;
            }
             t1.put(ch,ch2);
            t2.put(ch2,ch);
        }
        return true;
    }
}//problem 3
// Approach:
// Split the string into words and use two HashMaps for bidirectional mapping.
// Ensure every pattern character maps to exactly one word and vice versa.
// Return false on any mismatch, otherwise return true after processing all words.

// Time Complexity: O(N)
// Space Complexity: O(N)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        int m=pattern.length();
        int n=words.length;
        if(m!=n){
            return false;
        }
        HashMap<Character, String> map=new HashMap<>();
        HashMap<String, Character> map2=new HashMap<>();
        for(int i=0;i<m;i++){
            char ch=pattern.charAt(i);
            String ch2=words[i];
            if(map.containsKey(ch) && !map.get(ch).equals(ch2)){
                return false;
            }
            if(map2.containsKey(ch2) && map2.get(ch2)!=ch){
                return false;
            }
            map.put(ch,ch2);
            map2.put(ch2,ch);
        }
        return true;
    }
}
