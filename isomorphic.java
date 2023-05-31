//We can do this by either taking two hashmaps and map S-T and T-S
//We have a hashmap where we map S-T and a set where we add values
//if we already havce a key while adding to the hashmap then we check if the vlaue to be added and the value of that
//respective key is the same. 
//if we do not have the key in our map we check if value is already there in our set. If yes return false.

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null && t==null)return true;
        if (s==null || t==null)return false;
        HashMap<Character, Character> hashMap = new HashMap<>();
        HashSet<Character> hashSet = new HashSet<>();
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(hashMap.containsKey(sChars[i]))
            {
                if(hashMap.get(sChars[i]) != tChars[i])
                {
                     return false;
                }
            }
            else {
                if(hashSet.contains(tChars[i]))
                {
                    return false;
                }
                else {
                    hashMap.put(sChars[i],tChars[i]);
                    hashSet.add(tChars[i]);
                }
            }
           
        }
        return true;
    }
}