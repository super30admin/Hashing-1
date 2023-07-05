// Time Complexity : O(nk) 
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this: Understood the logic but made syntax errors
// Your code here along with comments explaining your approach: Prime factor multiplication. we will assign a prime number to each alphabet. Then we will multiply all the values for those character. The output will be same for anagrams. Then we will create a hasmap with key as product of these numbers and value as a list. wenever we find a word which is an anagram of another word, it will be added to this list



class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

//Prime factor multiplication. we will assign a prime number to each alphabet. Then we will multiply all the values for those character. The output will be same for anagrams. Then we will create a hasmap with key as product of these numbers and value as a list. wenever we find a word which is an anagram of another word, it will be added to this list

int [] p={ 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101};
        HashMap <Double,List<String>> Map= new HashMap<>();
        for (int i=0;i< strs.length;i++)
        {
            //find the prime product of the string
            double product=primeProduct(strs[i],p);
            //check if the product is already present in the hashmap
            if (!Map.containsKey(product))
            {
                //add the key and create a new arraylist for values
                Map.put(product, new ArrayList<>());
                //add the value to it
                Map.get(product).add(strs[i]);
            }
            //if not then add the key and the value to it

            else
            {
                Map.get(product).add(strs[i]);
            }

        }
       ArrayList<List<String>> values = new ArrayList<>(Map.values());

return values;
    }

    //function to calculate the prime product
    public double primeProduct(String Str,int[] p)
    {
        //ascii value of a=97, so for assigning 2 which is at index 0 to a, 
        //we will follow this method: a->ascii value of a-97=index of the value
        //a->97-97=0 so p[0] is 2, similarly b->98-97=1 arr[1]=3

        double product=1;
                for(int i=0;i<Str.length();i++)
                {
                    product= product* p[((int) Str.charAt(i)-97)];
                }
            return product;
    }
}
