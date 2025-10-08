// Time Complexity : O(log n).
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Approach : This problem is similar to isomorphic strings, but here each letter is mapped to a String. So we consider Character and String in the HashMap and
// implement the same idea.

// Your code here along with comments explaining your approach


class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        int n = arr.length;
        int p = pattern.length();

        if (n != p) return false;

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            char ch = pattern.charAt(i);

            if (map.containsKey(ch)) { //checking if already contains
                if (!map.get(ch).equals(arr[i])) { //checking if not equal to existing mapping
                    return false;
                }
            } else {
                if (set.contains(arr[i])) { //duplicate found
                    return false;
                }
                map.put(ch, arr[i]);
                set.add(arr[i]);
            }
        }

        return true;
    }
}