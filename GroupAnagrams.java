// Time Complexity : 0(nk)
// Space Complexity : 0(nk)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// Approach: An anagram are strings which when sorted are the same. However, sorting each string in the array would be n(KlogK) time complexity. 
// Hence we do prime product, where for every string, we calculate the prime product of the characters, if any string has the same prime product, 
// it means it is an anagram. We create a hashmap with the prime product value as the key and the corresponding strings whose prime product equats to this key as the values of the
// value of that prime product key
class GroupAnagrams{
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        
        // double because prime product can be a large value
        HashMap<Double,List<String>> map = new HashMap<>();
        
        for(String s:strs){

            double primeProduct = primeProduct(s);
            if(!map.containsKey(primeProduct)){
                map.put(primeProduct,new ArrayList<>());
            }
            map.get(primeProduct).add(s);
            
        }
        return new ArrayList<>(map.values());
        
    }
    
    private double primeProduct(String str){
        int[] prime={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101,103};
        
        double result=1;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            int pr=prime[c-'a']; //ASCII Value of char c - 'a' gives index of the character
            result*=pr;
        }
        return result;
            
        }
    }
    