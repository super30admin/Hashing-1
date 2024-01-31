// Time Complexity : O(n * klogk), n = length of array and k = avg length of strings
// Space Complexity : O(n * k) n = space of hashmap and for each entry k length of string
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : had to watch the video again to understand hashset solution


// Your code here along with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs){// n iterations
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr); // klogk
            String sortedStr = String.valueOf(charArr); // key in map

            if(!map.containsKey(sortedStr)){
                map.put(sortedStr, new ArrayList<String>());
            }
            map.get(sortedStr).add(str); // add original string to the list because key is same
        }

        return new ArrayList<>(map.values());
    }
}

//Optimized approach

// Time Complexity : O(n * k), n = length of array and k = avg length of strings
// Space Complexity : O(n * k) n = space of hashmap and for each entry k length of string
// Did this code successfully run on Leetcode : yes
// Your code here along with comments explaining your approach : optmized the sorting(klogk) in above solution.

class Solution {
    private int[] primeNum;
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();
        this.primeNum = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

        for(String str : strs){// n iterations
            double primeProd = primeProduct(str);
           
            if(!map.containsKey(primeProd)){
                map.put(primeProd, new ArrayList<String>());
            }
            map.get(primeProd).add(str); // add original string to the list because key is same
        }

        return new ArrayList<>(map.values());
    }

    //to find the primeproduct of the strings in k timecomplexity
    private double primeProduct(String str){
        double result = 1;
        for(char c : str.toCharArray()){
            result *= primeNum[c-'a'];
        }

        return result;
    }
}