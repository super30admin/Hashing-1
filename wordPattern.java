// 290. Word Pattern
// Time Complexity : O(n)
// Space Complexity : O(1) //Constant because there are only 26 characters, or 52 including ASCII
// Did this code successfully run on Leetcode : Yes

class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> pHash = new HashMap<>();
        HashMap<String, Character> sHash = new HashMap<>();

        String[] a = str.split(" ");

        // for(String s: a)
        //     System.out.println(s);

        if(pattern.length() != a.length)
            return false;

        for(int i =0; i<a.length; i++){
            char ch = pattern.charAt(i);

            if(!pHash.containsKey(ch))
                pHash.put(ch, a[i]);
            else
            if(!pHash.get(ch).equals(a[i]))
                return false;

            if(!sHash.containsKey(a[i]))
                sHash.put(a[i], ch);
            else
            if(!sHash.get(a[i]).equals(ch))
                return false;
        }

        return true;
    }
}