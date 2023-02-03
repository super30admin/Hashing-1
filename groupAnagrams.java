//TC: O(nk)
//SC: O()
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double , List<String>> map = new HashMap<>();
        for(String s: strs){//O(n)
            double primeProduct = primeProduct(s);//O(k)
            if(!map.containsKey(primeProduct)){
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(s);
        } 
        return new ArrayList<>(map.values());
    }    

        private double primeProduct(String s){
        double result = 1;
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        for(int i=0; i < s.length(); i++){
            //take char one by one
            char c = s.charAt(i);
            int prime = primes[c - 'a'];
            result *= prime;
        }
        return result;
    }
}


//TC: O(nklogk)
//SC: O(nk)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s:strs){
           char [] charArr = s.toCharArray();
           Arrays.sort(charArr);
           String sorted = String.valueOf(charArr);
           if(!map.containsKey(sorted)){
               map.put(sorted, new ArrayList<>());
           }
           map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
