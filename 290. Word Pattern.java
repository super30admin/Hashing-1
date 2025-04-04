class Solution {
    // Time Complexity: O(n)
    // Space Complexity O(n), n indicates the length of pattern or input string.
    // Actually, it should be n + n + n = 3n, 3 is contant, so O(n).
    public boolean wordPattern(String pattern, String s) {
        // check whether they have same length
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length) return false;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length == pattern.length());
        int len = arr.length;
        Map<Character, String> pMap = new HashMap<>();
        Map<String, Character> sMap = new HashMap<>();
        for(int i = 0; i < len; i++){
            pMap.putIfAbsent(pattern.charAt(i), arr[i]);
            // character we can directly use ==, but for string we need use string.equals()
            if(!pMap.get(pattern.charAt(i)).equals(arr[i])) return false;
            sMap.putIfAbsent(arr[i], pattern.charAt(i));
            if(sMap.get(arr[i]) != pattern.charAt(i)) return false;
        }
        return true;
    }
}