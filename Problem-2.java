// Determine if strings are Isomorphic

//1st Solution using 2 Hashmaps
// Time complexity: O(n) for iterating the strings and constant for Hashmap operations
//So total Time complexity: O(n) where n is length of the string.
//Space Complexity: O(1) Constant space complexity 
//Because each hashmap will have at most 26 entries as there are only 26 characters.

class Solution {
    public boolean isIsomorphic(String s, String t) {

    if((s == null) || (t==null)) return false;
    if(s.length()!=t.length()) return false;

    HashMap<Character, Character> sMap = new HashMap<Character, Character>();
    HashMap<Character, Character> tMap = new HashMap<Character, Character>();

    for(int i = 0; i< s.length(); i++) {
        if(!sMap.containsKey(s.charAt(i))) {
            sMap.put(s.charAt(i), t.charAt(i));
        }
        else {
            if(t.charAt(i) != sMap.get(s.charAt(i))) return false;
        }

        if(!tMap.containsKey(t.charAt(i))) {
            tMap.put(t.charAt(i), s.charAt(i));
        }
        else {
            if(s.charAt(i) != tMap.get(t.charAt(i))) return false;
        }

    }
    return true;
        
    }
}

// 2nd Solution: using a Hashset and a HashMap
//Time Complexity: O(n) and O(1) for all hash operations so Total: O(n)
//Space Complexity: O(1) Constant as entries can utmost be 26 so constant.

class Solution {
    public boolean isIsomorphic(String s, String t) {

    if((s == null) || (t==null)) return false;
    if(s.length()!=t.length()) return false;

    HashMap<Character, Character> sMap = new HashMap<Character, Character>();
    HashSet<Character> tSet = new HashSet<Character>();

    for(int i = 0; i< s.length(); i++) {
        if(!sMap.containsKey(s.charAt(i))) {
            if(tSet.contains(t.charAt(i))) return false;
            else {
                sMap.put(s.charAt(i), t.charAt(i));  
            }
            tSet.add( t.charAt(i));
        }
        else {
            if(t.charAt(i) != sMap.get(s.charAt(i))) return false;
        }

    }
    return true;
        
    }
}

//3rd Solution: Using ascii character array , not hashmap
//Time Compexity: O(n)
//Space Complexity: O(1)
class Solution {
    public boolean isIsomorphic(String s, String t) {

    if((s == null) || (t==null)) return false;
    if(s == null && t==null) return false;
    if(s.length()!=t.length()) return false;

    char[] sMap = new char[256];
    char[] tMap = new char[256];

    for(int i = 0; i< s.length(); i++) {
        char sChar = s.charAt(i);
        char tChar = t.charAt(i);

        if(sMap[sChar - ' '] == 0) {
            sMap[sChar - ' '] = tChar;
        }
        else {
            if(sMap[sChar - ' '] != tChar) return false;
        }

        if(tMap[tChar - ' '] == 0) {
            tMap[tChar - ' '] = sChar;
        }
        else {
            if(tMap[tChar - ' '] != sChar) return false;
        }
    }
    return true;
        
    }
}