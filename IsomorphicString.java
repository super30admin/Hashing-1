// Time Complexity : O(n) where n is the length of string
// Space Complexity :O(1) as max assci chars are 256
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        //return false, if len of both strings is not same
        if(s.length()!=t.length())
        {
            return false;
        }
        //HashMap to store char to char mapping for both s and t, and vice-versa
        Map<Character,Character> sMap = new HashMap<>();
        Map<Character,Character> tMap = new HashMap<>();
        for(int i = 0;i<s.length();i++)
        {
            //if currChar exists in sMap
            //make sure that is being repeat3ed in t,
            //else return false
            //not exists put in sMap
            if(sMap.containsKey(s.charAt(i)))
            {
                char existingChar = sMap.get(s.charAt(i));
                if(existingChar!=t.charAt(i))
                {
                    return false;
                }
            }
            else
            {
                sMap.put(s.charAt(i),t.charAt(i));
            }

            //check for t string to map for s
            if(tMap.containsKey(t.charAt(i)))
            {
                char existingChar = tMap.get(t.charAt(i));
                if(existingChar!=s.charAt(i))
                {
                    return false;
                }
            }else
            {
                tMap.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
    }
}

// Time Complexity : O(n) where n is the length of string
// Space Complexity :O(1) as max assci chars are 256
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        //return false, if len of both strings is not same
        if(s.length()!=t.length())
        {
            return false;
        }
        //HashMap to store char to char mapping for both s and t, and
        //tSet if a value in map, already being mapped to other char
        Map<Character,Character> sMap = new HashMap<>();
        Set<Character> sSet = new HashSet<>();
        for(int i = 0;i<s.length();i++)
        {
            //if currChar exists in sMap
            //make sure that is being repeat3ed in t,
            //else return false
            if(sMap.containsKey(s.charAt(i)))
            {
                char existingChar = sMap.get(s.charAt(i));
                if(existingChar!=t.charAt(i))
                {
                    return false;
                }
            }
            //not exists put in sMap, before check if that value is being used else to map
            //so store that in a set
            else
            {
                if(sSet.contains(t.charAt(i)))
                {
                    return false;
                }
                sMap.put(s.charAt(i),t.charAt(i));
                sSet.add(t.charAt(i));
            }
        }
        return true;
    }
}