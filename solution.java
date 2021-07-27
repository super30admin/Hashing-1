//finding the peak element.
//TC:-O(logn)
//space:-O(1)

public class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}

//Isomorphic string
//TC:-O(n) where n is the length of the string
//SC:- O(256) where we are using a hashmap of length which wil be maximun of 256 characters.

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null||s.length()==0){
            return false;
        }
        HashMap<Character,Character> sMap=new HashMap<Character,Character>();
        HashMap<Character,Character> tMap=new HashMap<Character,Character>();
        for(int i=0;i<s.length();i++){
            if(!sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i),t.charAt(i));
            }
            else{
                if(sMap.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
            if(!tMap.containsKey(t.charAt(i))){
                tMap.put(t.charAt(i),s.charAt(i));
            }
            else{
                if(tMap.get(t.charAt(i))!=s.charAt(i)){
                    return false;
                }
            }
            
        }
        return true;
        
        
    }
}