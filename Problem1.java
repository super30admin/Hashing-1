class Solution {
    public double product(String s){
        int[] prime = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101};
        double res = 1;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            res = res*prime[c-'a'];
        }
        return res;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<Double,List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String s = strs[i];
            double key = product(s);
            if(!map.containsKey(key))
                map.put(key,new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}