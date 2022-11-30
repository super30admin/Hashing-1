// Time Complexity : O(pattern * s)
// Space Complexity : O(pattern+s)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
/*
We will map each character in pattern to a each substring in s
if mapping found previously then it must match the same substring otherwise false;
if the value was already mapped, then return false
*/
class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] strings = s.split(" "); // get array of string 

        HashMap<Character,String> map = new HashMap<Character,String>();
        Set<String> taken = new HashSet<String>();

        if(pattern.length() != strings.length){ // if pattern and array of strings lenth are not matching then return false
            return false;
        }
        for(int i=0;i<pattern.length();i++){  //O (pattern)
            Character patChar = pattern.charAt(i);
            // check if the mapping exists, if so it should be with the same String otherwise false

            if(map.containsKey(patChar)){
                if(!map.get(patChar).equals(strings[i])){ // O (s) 
                    return false;
                }
            }
            else{
                // Check if String has already been mapped, if so , then return false
                if(taken.contains(strings[i])){
                    return false;
                }

                // Now add to map and Taken
                map.put(patChar,strings[i]);
                taken.add(strings[i]);
            }

        }

        return true;
    }
}