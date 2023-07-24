class Solution {
    //Time Complexity :- O(n)
    //Space Complexity :- O(n)
    public boolean wordPattern(String pattern, String s) {
        List<String> list = new ArrayList<>();
        HashMap<Character,String> hashMap = new HashMap<>();
        HashMap<String,Character> CharMap = new HashMap<>();
        list = List.of(s.split(" "));


        if (pattern.length() == list.size())
        {
            for (var i=0;i<pattern.length();i++)
            {
                if (hashMap.size()>0 && CharMap.size()>0) {
                    if (hashMap.containsKey(pattern.charAt(i)))
                    {
                        if (!hashMap.get(pattern.charAt(i)).equals(list.get(i)))
                        {
                            return false;
                        }
                    }
                    else if (CharMap.containsKey(list.get(i))) {
                        if (!CharMap.get(list.get(i)).equals(pattern.charAt(i)))
                        {
                            return false;
                        }
                    }
                    else {
                        hashMap.put(pattern.charAt(i),list.get(i));
                        CharMap.put(list.get(i),pattern.charAt(i));
                    }
                }
                else {
                    hashMap.put(pattern.charAt(i),list.get(i));
                    CharMap.put(list.get(i),pattern.charAt(i));
                }
            }
        }
        else
        {
            return false;
        }
        
        return true;
    }
}