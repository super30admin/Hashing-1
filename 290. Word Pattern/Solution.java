class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] arr = s.split(" ");
        if (arr.length != pattern.length())
            return false;

        HashMap<Character, String> pmap = new HashMap<>();
        HashMap<String, Character> smap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            char pchar = pattern.charAt(i);

            if (pmap.containsKey(pchar)) {
                if (!pmap.get(pchar).equals(arr[i]))
                    return false;

            } else {
                pmap.put(pchar, arr[i]);
            }

            if (smap.containsKey(arr[i])) {
                if (!smap.get(arr[i]).equals(pchar))
                    return false;

            } else {
                smap.put(arr[i], pchar);
            }
        }
        return true;
    }
}

// TC - O(n)
// SC - O(n)