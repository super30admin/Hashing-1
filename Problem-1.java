//tc=O(nk)
//sc=O(n)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        HashMap<Double, List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            double primeproduct=primeProduct(str);
            if(!map.containsKey(primeproduct)){
                map.put(primeproduct,new ArrayList<>());
            }
            map.get(primeproduct).add(str);
        }
        return new ArrayList<>(map.values());
    }
    private double primeProduct(String s){
        int[] primes={2,3,5,7,11,13,17,19,23,29,31,37,41,47,53,59,61,67,71,73,79,83,97,101,103};
        double result=1;
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            result=result*primes[c - 'a'];
        }
        return result;
    }
}