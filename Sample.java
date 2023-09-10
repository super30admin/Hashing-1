                          // Group Anagrams
// Time Complexity : O(nk) .. n = number of words, k = length of each string
// Space Complexity : O(n)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList();
        Map<Double, List<String>> map = new HashMap();
        int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67,  71, 73, 79, 83, 89, 97, 101, 103};

        for(String str : strs){
            double mult = 1;
            for(char ch : str.toCharArray())
                mult *= primes[ch - 'a'];
            if(map.containsKey(mult))
                map.get(mult).add(str);
            else {
                map.put(mult, new ArrayList<String>());
                map.get(mult).add(str);
            }
        }

        for(Map.Entry<Double, List<String>> mapElement : map.entrySet())
            list.add(new ArrayList(mapElement.getValue()));
        
        return list;
    }
}


                          // Isomorphic Strings
// Time Complexity : O(n) ... n = length of strings s and t
// Space Complexity : O(n) 

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int len = s.length();
        Map<Character, Character> map = new HashMap();
        Set<Character> set = new HashSet();
        for(int i=0;i<len;i++){
            char schar = s.charAt(i), tchar = t.charAt(i);
            if(map.containsKey(schar)){
                if(map.get(schar) != tchar)
                    return false;
            } else {
                if(set.contains(tchar))
                    return false;
                else {
                    map.put(schar, tchar);
                    set.add(tchar);
                }
            }
        }
        return true;
    }
}

                          // Word Pattern
// Time Complexity : o(n) .. n = number of words in string 'pattern'
// Space Complexity : O(1) ... there are max 26 characters.

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] list = s.split(" ");
        int len = pattern.length();
        if(list.length != pattern.length())
            return false;
        Map<Character, String> map = new HashMap();
        Set<String> set = new HashSet();

        for(int i=0;i<len;i++){
            char ch = pattern.charAt(i);
            String word = list[i];
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(word))
                    return false;
            } else {
                if(set.contains(word))
                    return false;
                else {
                    map.put(ch, word);
                    set.add(word);
                }
            }
        }

        return true;
    }
}
