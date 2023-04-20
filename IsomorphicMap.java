// Time Complexity : 
// Space Complexity :   
// Did this code successfully run on Leetcode : No 
// Any problem you faced while coding this : YES
//This approach was discusses in the class, I tried to implement but got stuck
// thinking all these funtion call to repalcr, remove takes time internally and fails for multiple test case due to 
//s_ = s_.replace(String.valueOf(sChar), "");
//t_ = t_.replace(String.valueOf(tChar), "");

//Last Executed Input
//s ="qwertyuiop[]asdfghjkl;'\\zxcvbnm,./"
//t = "',.pyfgcrl/=aoeuidhtns-\\;qjkxbmwvz"
// Your code here along with comments explaining your approach

import java.util.HashMap;

public class IsomorphicMap {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        StringBuilder ss = new StringBuilder();
        StringBuilder st = new StringBuilder();
        ss.append('s');
        st.append('t');
        HashMap<String, Character> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            String s_ = ss.append(sChar).toString();
            String t_ = st.append(tChar).toString();
            if(map.containsKey(s_)) {
                if(map.get(s_) != tChar) {
                    return false;
                }
            } else {
                map.put(s_, tChar);
            }
            if(map.containsKey(t_)) {
                if(map.get(t_) != sChar) {
                    return false;
                }
            } else {
                map.put(t_, sChar);
            }
            s_ = s_.replace(String.valueOf(sChar), "");
            t_ = t_.replace(String.valueOf(tChar), "");
            ss = new StringBuilder(s_);
            st = new StringBuilder(t_);
        }
        return true;
    }
}
