// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set= new HashSet<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(set.contains(c)){
                set.remove(c);
                count=count+2;
            }
            else{
            set.add(c);
            }
        }
        if(!set.isEmpty()){
            count++;
        }
        return count;
    }
}