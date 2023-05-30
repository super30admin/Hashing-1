class Solution {
    public boolean isIsomorphic(String s, String t) {

        int [] map1 = new int[256];
        int [] map2 = new int[256];

        if(s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++)
        {
            System.out.println(s.charAt(i));
             System.out.println(map2[t.charAt(i)]);
             if(map1[s.charAt(i)] != map2[t.charAt(i)])
                return false;
            else
            {
                map1[s.charAt(i)] = i+1;
                map2[t.charAt(i)] = i+1;
            }
        }
        return true;
}
}
