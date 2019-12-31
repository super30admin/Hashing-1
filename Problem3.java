// Time Complexity :
//      n - size of the bigger string
//      wordPattern() - O(n)
//      
// Space Complexity :
//      wordPattern() - O(1)
//
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Problem3 {
	public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> pHash = new HashMap<>();
        HashMap<String, Character> sHash = new HashMap<>();
        
        String word = "";
        
        int i = 0, j = 0;
        
        for(j=0; j < str.length(); ++j)
        {
            if(i == pattern.length())
                return false;
            if(str.charAt(j) != ' ')
            {
                word += str.charAt(j);
            }
            else
            {
                char a = pattern.charAt(i);
                String b = word;
                
                word = "";
                ++i;

                if(!pHash.containsKey(a))
                    pHash.put(a, b);
                else
                {
                    if(!pHash.get(a).equals(b))
                        return false;
                }

                if(!sHash.containsKey(b))
                    sHash.put(b, a);
                else
                {
                    if(!sHash.get(b).equals(a))
                        return false;
                }
            }   
        }
        
        if(word == "" && i != pattern.length())
            return false;
        
        if( (word != "" && i < pattern.length()-1) || (word != "" && i != pattern.length()-1))
            return false;
        
        char a = pattern.charAt(i);
        String b = word;

        if(!pHash.containsKey(a))
            pHash.put(a, b);
        else
        {
            if(!pHash.get(a).equals(b))
                return false;
        }

        if(!sHash.containsKey(b))
            sHash.put(b, a);
        else
        {
            if(!sHash.get(b).equals(a))
                return false;
        }
        return true;
    }
}