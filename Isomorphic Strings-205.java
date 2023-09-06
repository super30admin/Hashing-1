class Solution {
    // Time complexity: O(n)
    // Space complexity: O(1)
    public boolean isIsomorphic(String s, String t) {

// If both the strings have distinct length return false
        if(s.length() != t.length())
        {
            return false;
        }

// To store values of Character in String s and its corresponding value at same index in string t
        HashMap<Character, Character> hashForS = new HashMap<>();
        //HashMap<Character, Character> hashForT = new HashMap<>();
        // To store values of Character in String t
        HashSet<Character> hashForT = new HashSet<>();

        for(int i =0;i<s.length();i++)
        {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
// if the char from string s does not exist in hashForS
            if(!hashForS.containsKey(charS))
            {
                // add the value
               hashForS.put(charS,charT);
               // if the corresponding char in string t is already mapped to another char in string s the return false
               if(hashForT.contains(charT))
               {
                   return false;
               }
               // if its not mapped to any char in string s then add char at specific index i to hashForT
               hashForT.add(charT);
            }
            // If the char is already in the hashForS then check is the mapping for string s and string t is in sync. If not return false
            else {
                if(hashForS.get(charS) != charT)
                {
                    return false;
                }
            }
            // else {
            //     if(hashForS.get(charS) != charT)
            //    {
            //        return false;
            //    }  
            // }


            // if(!hashForT.containsKey(charT))
            // {
            //    hashForT.put(charT,charS);
            // }
            // else {
               
            //    if(hashForT.get(charT) != charS)
            //    {
            //        return false;
            //    }
            // }

        }

       return true;
    }
        
}
