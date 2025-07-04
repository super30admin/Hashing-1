class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> m=new HashMap<>();
        for(String str:strs){
            double pp=pp(str);
           if(!m.containsKey(pp)){
            m.put(pp,new ArrayList<>());
           }
           m.get(pp).add(str);
        }
        return new ArrayList<>(m.values());
    }
    private double pp(String str){
        int[] primes={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
            41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double pp=1.0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            pp=pp*primes[c-'a'];
        }
        return pp;
    }

}