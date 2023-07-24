class Solution {
    //Time Complexity :- O(n)
    //Space Complexity:- O(n)
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hashMap1 = new HashMap<>();
        HashMap<Character,Character> hashMap2 = new HashMap<>();
        for (var i=0;i<s.length();i++)
        {
            if (hashMap1.containsKey(s.charAt(i)))
            {
                if (!hashMap1.get(s.charAt(i)).equals(t.charAt(i)))
                {
                    return false;
                } 
            }
            else if (hashMap2.containsKey(t.charAt(i))) {
                if (!hashMap2.get(t.charAt(i)).equals(s.charAt(i)))
                {
                    return false;
                }
            } else{
                hashMap1.put(s.charAt(i),t.charAt(i));
                hashMap2.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
    }
}