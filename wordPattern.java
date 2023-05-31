//We follow the same technique used for Isomorphic strings

class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(s==null && pattern==null)return true;
        String[] words = s.split(" ");
        char[] chars = pattern.toCharArray();
        if(words.length != chars.length)return false;
        HashMap<Character,String> hashMap = new HashMap<>();
        HashSet<String> hashSet = new HashSet<>();
        for(int i=0;i<words.length;i++)
        {
            if(hashMap.containsKey(chars[i]))
            {
                if(!hashMap.get(chars[i]).equals(words[i]))
                {
                    return false;
                }
            }
            else {
                if(hashSet.contains(words[i]))
                {
                    return false;
                }
                else {
                    hashMap.put(chars[i],words[i]);
                    hashSet.add(words[i]);
                }
            }

        }

        return true;
        
    }
}