/ Time Complexity : O(nk)
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class SolutionGroupAnagrams {
    
    int[] primeArray = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
    
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> hm = new HashMap<>();
        
        //Store all strings in keys as hashcodes (representing each character as a unique prime number) and everytime a string matches that hashcode store it against that hascode)
        for(int i = 0; i < strs.length; i++){
            double pp = primeProduct(strs[i]);
            if(!hm.containsKey(pp)){
                hm.put(pp,new ArrayList<>());
            }
            hm.get(pp).add(strs[i]);
        }
        
        return new ArrayList<>(hm.values()); //group and return all map values
    }
    
    double primeProduct(String s){
        double result = 1;
        for(int i = 0; i < s.length(); i++){
            result = result * primeArray[s.charAt(i) - 'a'];
        }
        return result;
    }
}
