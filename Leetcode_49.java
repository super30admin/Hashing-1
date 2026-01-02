//Way1:
//Rule: all the anagrams will have same sorted string
//So, sort the strings and group the strings which are having same anagrams
//TC: n * [(m log m) + m] -- where n is total number of strings. m is averge length of string
//SC: O(n*m)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();

        for(String str:strs){
            char[] s=str.toCharArray();

            Arrays.sort(s);
            
            String sortStr=String.valueOf(s);

            if(!(map.containsKey(sortStr))){
                map.put(sortStr,new ArrayList<>());
            }

            List<String> list=map.get(sortStr);

            list.add(str);
        }
        
        return new ArrayList<>(map.values());
    }
}

//Way2:
//Rule: all the anagrams will have same hash key
//So, generate a hashkey for every string. Group all the strings which are having same hash key. Here hash key is product of primes for repective characters in string
//TC: n * m -- where n is total number of strings. m is averge length of string
//SC: O(n*m)
import java.math.BigInteger;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<BigInteger,List<String>> map=new HashMap<>();
        int[] arr=new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};

        for(String str:strs){
            BigInteger res=BigInteger.valueOf(1);

            for(char c:str.toCharArray()){
                res=res.multiply(BigInteger.valueOf(arr[c - 'a']));
            }



            if(!(map.containsKey(res))){
                map.put(res,new ArrayList<>());
            }

            List<String> list=map.get(res);
            list.add(str);
        }
        
        return new ArrayList<>(map.values());
    }
}
