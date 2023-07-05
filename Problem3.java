// Time Complexity : O(n) 
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this: No
// Your code here along with comments explaining your approach: First I have added all the words from the String to a string List. Then I have maintained a hashmap to keep track of all the characters of the pattern as keys
//and the words from the string as values. Then we have to check if the key  is already present, if it is then if the value is the same as the previous value. If the key is not already present, then we check if the value is already present in the map, if yes then we return false.


class Solution {
    public boolean wordPattern(String pattern, String s) {

        List<String> words = Arrays.asList(s.split(" ")); // Splitting the string by space

        if(pattern.length()!=words.size()) return false;
        if(pattern==null && s==null) return true;
        if(s==null || s==null) return false;

        HashMap<Character,String> First=new HashMap<>();


        for(int i=0;i<pattern.length();i++)
        {
            char pchar=pattern.charAt(i);
            String Svalue=words.get(i);
            System.out.println(i + " " + pchar + " " + Svalue);
//if the key is already present in the hashmap
            if(First.containsKey(pchar))
            {

                if (!(Svalue.equals(First.get(pchar))))
                {
                    System.out.println(i + " " + pchar + " " + Svalue + " inside");
                    return false;
                }
            }
            else
// if the key is not present, check if the value is already present
                if(First.containsValue(Svalue)) return false;
                
                else
            {
                First.put(pchar,Svalue);

            }


        }

        return true;
    }
}

        
