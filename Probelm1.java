// TC O(n*k)
// SC O(n)

class Solution {

    private static int[] primeValues= {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31,
                37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<Double,List<String>> map= new HashMap<>();

        for(String s: strs){

            char[] charArr = s.toCharArray();

            double hashCode= getKey(charArr);
            
            if(!map.containsKey(hashCode)){
                map.put(hashCode, new ArrayList<>());
            }

            map.get(hashCode).add(s);
        }

        return new ArrayList<>(map.values());
    }

    private double getKey(char[] charArr){
        double x= 1;
        for( char i: charArr){
            x*= primeValues[i-'a'];
        }
        return x;
    }

}