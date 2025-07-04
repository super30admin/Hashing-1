class Solution {
    public boolean wordPattern(String pattern, String s) {
        /* 2 HASHMAPS
         String[] arr = s.split(" ");
        int n = arr.length;
        int k = pattern.length();

        if (n != k) return false;

        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();

        for (int i = 0; i < n; i++) {

            char a = pattern.charAt(i);

            if (!pMap.containsKey(a)) {
                pMap.put(a, arr[i]);
            } else {
                if (!pMap.get(a).equals(arr[i])) return false;
            }

            if (!sMap.containsKey(arr[i])) {
                sMap.put(arr[i], a);
            } else {
                if (!sMap.get(arr[i]).equals(a)) return false;
            }
        }

        return true;*/

//1 HASHMAP And 1 HASH SET
         String[] arr = s.split(" ");
        int n = arr.length;
        int k = pattern.length();

        if (n != k) return false;

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            char ch = pattern.charAt(i);

            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(arr[i])) return false;
            } else {
                if (set.contains(arr[i])) return false;
                map.put(ch, arr[i]);
                set.add(arr[i]);
            }
        }

        return true;
    }
}