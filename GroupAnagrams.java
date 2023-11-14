//Time Complexity:O(nk)
//Space Complexity: O(n)
class Solution {
    int[] primeArr ;
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length==0) return new ArrayList<>();
        primeArr = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101,103};

        HashMap<Double,List<String>> map = new HashMap<>();
        for(String str:strs){
            /*char[] charStr = str.toCharArray();
            Arrays.sort(charStr);
            String sortedString = String.valueOf(charArr);

            if(!map.containsKey(sortedString))
                map.put(sorted,new ArrayList<>());
            map.get(sorted).add(str);

            return new ArrayList(map.values());*/

            double hashValue = getHash(str);

            if(!map.containsKey(hashValue))
                map.put(hashValue,new ArrayList<>());
            map.get(hashValue).add(str);

        }
         return new ArrayList(map.values());
    }

    public double getHash(String str){
        double hash = 1d;

        for(char c: str.toCharArray()){
            hash *= primeArr[c-'a'];
        }

        return hash;
    }
}
