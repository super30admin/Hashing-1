class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        // Time complexity: O(n)+O(n+k) where k is length of each element in s if strpipped by space and n is length of pattern 
        // Space complexity: O(1) the maximum
        String[] sArray = s.split(" ");
        if(sArray.length!=pattern.length())
        {
            return false;
        }
        HashMap<Character, String> mapPattern = new HashMap<>();
        //HashMap<String, Character> mapS = new HashMap<>();
        HashSet<String> mapS = new HashSet<>();

        for(int i =0;i<pattern.length();i++)
        {
            char c = pattern.charAt(i);
            String str = sArray[i];

            if(!mapPattern.containsKey(c))
            {
                if(mapS.contains(str))
                {
                    return false;
                }
                mapS.add(str);
                mapPattern.put(c, str);
            }
            else {
                if(!mapPattern.get(c).equals(str))
                {
                    return false;
                }
            }     
        }

        return true;

    }
}
