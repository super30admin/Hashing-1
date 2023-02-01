// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
/* I have taken two maps - one of which takes a Character and String as a key-value pair and the other which takes a String and a Character as the key-value pair. For every character in 
 * pattern, I map the corresponding word from s and vice versa. If a particular key already exists in the map, I check if the value present is the correct one, if not I return false
 */


class Solution3 {
    public boolean wordPattern(String pattern, String s) {
        String words[] = s.split(" ");
        if(pattern.length()!=words.length)
        {
            return false;
        }
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();

        for(int i=0;i<words.length;i++)
        {
            String word = words[i];
            char c = pattern.charAt(i);
            if(map1.containsKey(c))
            {
                if(!map1.get(c).equals(word))
                {
                    return false;
                }
            }
            else
            {
                map1.put(c,word);
            }

            if(map2.containsKey(word))
            {
                if(map2.get(word)!=c)
                {
                    return false;
                }
            }
            else
            {
                map2.put(word,c);
            }
        }
        return true;

    }
}