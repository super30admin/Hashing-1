// Time Complexity : O(n) where n is the length of input
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        //Split the string with " "
        String[] sArr = s.split(" ");
        //check if pattern len is not equals to split array len return false
        if(pattern.length()!=sArr.length)
        {
            return false;
        }
        //store the key as pattern char, and string as value
        //store the seen string in map to check not being used for any other char
        Map<Character,String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        char[] patternArr = pattern.toCharArray();
        for(int i = 0;i<patternArr.length;i++)
        {
            if(map.containsKey(patternArr[i]))
            {
                String val = map.get(patternArr[i]);
                if(!val.equals(sArr[i]))
                {
                    return false;
                }
            }
            else
            {
                if(set.contains(sArr[i]))
                {
                    return false;
                }
                map.put(patternArr[i],sArr[i]);
                set.add(sArr[i]);
            }
        }
        return true;
    }
}