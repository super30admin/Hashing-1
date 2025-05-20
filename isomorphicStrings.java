class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] res = new int[200];
        int[] res1 = new int[200];

        for (int i = 0; i < s.length(); i++) {
            if(res[s.charAt(i)]!=res1[t.charAt(i)])
            {
                return false;
            }
            res[s.charAt(i)]=i+1;
            res1[t.charAt(i)]=i+1;
        }
        
        return true;

    }
}