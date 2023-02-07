//Time Complexity : O(nk) , since we are storing prime product in the hashmap so no sorting is done as was done in previous approach so time complexity changes
//Space complexity : O(nk) where n is number of words and k is length of each word
// Approach: iterate on string array one by one, and store prime product in the hashmap as key. then check for upcoming word if its primeproduct is present as key, if yes then add the new word in the array list.

class Solution {

    public Double pProduct(String s){

        double result = 1;
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            int prime = primes[c-'a'];
            result*=prime;
        }
        return result;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> myMap = new HashMap<>();
        for(String s : strs){
            Double primeProduct = pProduct(s);
            if(!myMap.containsKey(primeProduct)){
                myMap.put(primeProduct, new ArrayList<>());
            }
            myMap.get(primeProduct).add(s);
        }

        return new ArrayList<>(myMap.values());
    }
}


//Time coplexity : O(n) where n is the length of the string
//Space complexity : O(1) because at max 52 characters will be stored i.e. 26 small and 26 capital letters
// Approach using 2 hashmaps
class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> s1 = new HashMap<>();
        HashMap<Character, Character> t1 = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0 ; i<s.length(); i++){
            if(!s1.containsKey(s.charAt(i))){
                s1.put(s.charAt(i),t.charAt(i));
            } else if (s1.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
            if(!t1.containsKey(t.charAt(i))){
                t1.put(t.charAt(i),s.charAt(i));
            } else if (t1.get(t.charAt(i)) != s.charAt(i)){
                return false;
            }
        }
     return true;
}
}

//Time complexity : O(n) where n is the length of pattern
//Space complexity: O(1) as there can be maximum of  52 characters in the input string which will need to be stored in the map
//Approach : Using hashmap and set. Set is used to keep track of values that are already inside the hashmap.
class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character,String> myMap = new HashMap<>();
        HashSet<String> mySet = new HashSet<>();
        String[] input = s.split(" ");
        if(pattern.length() != input.length){
            return false;
        }

        for( int i =0; i<pattern.length(); i++){
            char check = pattern.charAt(i);
            if(!myMap.containsKey(check)){
                if(mySet.contains(input[i])){
                    return false;
                }
                myMap.put(check,input[i]);
                mySet.add(input[i]);

            } else {
                if(myMap.get(check).equals(input[i]) ){
                    myMap.put(check,input[i]);

                } else return false;
            }
        }
        return true;
    }
}


