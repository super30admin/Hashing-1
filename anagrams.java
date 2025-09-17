class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();
        for(String str:strs){//n
            double primeProduct = primeProduct(str);
            if(!map.containsKey(primeProduct)){
                map.put(primeProduct, new ArrayList<>());
            } 
            map.get(primeProduct).add(str);
        }
        return new ArrayList<>(map.values());
    }
      double primeProduct(String str){//k
            int[] prime = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
            double result = 1.0;
            for(int i = 0; i < str.length(); i++){
                int c = str.charAt(i);
                result = result * (prime[c-'a']);
            }
            return result;
        }
}

//TC: O(n+k)
//SC: O(1)