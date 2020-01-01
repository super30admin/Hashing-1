class GroupingAnagrahms {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<Integer, List<String>> myHashMap = new HashMap<>();
        for(int i = 0 ; i< strs.length; i++){
            if(!myHashMap.containsKey(calculatePrimeProduct(strs[i])))
                myHashMap.put(calculatePrimeProduct(strs[i]), new ArrayList<String>());
            myHashMap.get(calculatePrimeProduct(strs[i])).add(strs[i]);
        }        
        return new ArrayList(myHashMap.values());        
    }
    
    
    public int calculatePrimeProduct(String str){
        int[] primes = new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43, 47, 53, 59, 61, 67,
71, 73, 79, 83, 89, 97, 101};
        int outputProduct = 1;
        for(int i=0; i<str.length(); i++){
            outputProduct = outputProduct * primes[str.charAt(i) - 97];
        }
        return outputProduct;
    }
}