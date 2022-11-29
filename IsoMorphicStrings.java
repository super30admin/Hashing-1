import java.util.HashMap;
import java.util.Map;

//Time Complexity :O(N) where N is the size of given array 
//Space Complexity :O(1) constant space because of  map size can only be of size of character set 
//Did this code successfully run on Leetcode :Yes
//Any problem you faced while coding this : No 

public class IsoMorphicStrings {
	
	 public boolean isIsomorphic(String s, String t) {

	        if(s.length()!=t.length())
	            return false;

	        Map<Character,Character> maps = new HashMap<>();
	        Map<Character,Character> mapt = new HashMap<>();
	        int i=0;
	        int n= s.length();

	        while(i<n){
	            char k = s.charAt(i);
	            char v= t.charAt(i);
	            if(maps.containsKey(k) && v!=maps.get(k) ){
	                return false;
	            }
	            else{
	                maps.put(k,v);
	            }
	            if(mapt.containsKey(v) && k!=mapt.get(v) ){
	                return false;
	            }
	            else{
	                mapt.put(v,k);
	            }


	            i++;
	        }

	        return true;
	    }
}
