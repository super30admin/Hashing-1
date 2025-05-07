class Solution {
    //Time complexity: O(nklogk)
    //Space complexity: O(n)
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Double,List<String>> hm=new HashMap<>();
        for(String s:strs){
            double pp=primeProduct(s);
            if(!hm.containsKey(pp)){
                hm.put(pp,new ArrayList<String>());
            }
            hm.get(pp).add(s);
        }
        return new ArrayList<>(hm.values());
    }
    private double primeProduct(String s){
        int[] ap={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,81,89,97,101,103};
        double res=1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            res*=ap[c-'a'];
        }
        return res;
    }
}