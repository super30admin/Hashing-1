/* Used a character array and a boolean array.
 * Using hashing searching through n elements in character array - O(n) & in boolean array - O(1)
 * Time complexity: O(n)
 * Space complexity: O(1)
 */

class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sMap = new char[100];
        boolean[] set = new boolean[100];

        for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap[sChar - ' '] != 0){
                if(sMap[sChar - ' '] != tChar) return false;
            }else{
                if(set[tChar - ' ']) return false;
                set[tChar - ' '] = true;
                sMap[sChar - ' '] = tChar;
            }
        }

        return true;
    }
}