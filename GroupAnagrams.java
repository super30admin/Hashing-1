class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Double, List<String>> map=new HashMap<>(); //key is sorted string, values are given strings formed by the key
        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            double primeProduct=primeProduct(str);
            if(!map.containsKey(primeProduct)) //creating new key if it is not existing
                map.put(primeProduct,new ArrayList<>());
            map.get(primeProduct).add(str); //adding values to key
        }
        return new ArrayList<>(map.values());
    }

    double primeProduct(String s){
        int[] primes={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        double result=1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            result=result*primes[c-'a'];
        }
        return result;
    }
}
