class Solution1 {
    public boolean wordPattern(String pattern, String s) {

        String[] arr = s.split(" ");
        if (arr.length != pattern.length())
            return false;

        HashMap<Character, String> pmap = new HashMap<>();
        HashSet<String> smap = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            char pchar = pattern.charAt(i);
            if (pmap.containsKey(pchar)) {
                if (!pmap.get(pchar).equals(arr[i]))
                    return false;
            } else {
                if (smap.contains(arr[i]))
                    return false;
                smap.add(arr[i]);
                pmap.put(pchar, arr[i]);
            }
        }
        return true;
    }
}

// TC - O(n)
// SC - O(n)