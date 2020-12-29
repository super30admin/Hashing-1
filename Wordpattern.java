import java.util.HashMap;
import java.util.Map;

public class Wordpattern {

	
		 public boolean wordPattern(String pattern, String s) {
		        Map<Character, Integer> m1 = new HashMap<>();
				    Map<String, Integer> m2 = new HashMap<>();
				    String[] arr=s.split(" ");
				    if(arr.length==pattern.length()) {
				    for(Integer i = 0; i < pattern.length(); i++) {

				        if(m1.put(pattern.charAt(i), i) != m2.put(arr[i], i)) {
				            return false;
				        }
				    }
				    }
		        else
		            return false;
				return true; 
		    }
	 
	 
	 public static void main(String args[])
		{
			Wordpattern iso=new Wordpattern();
			//System.out.print("count"+iso.getcount("title"));
			System.out.println("check()="+iso.wordPattern("abba","dog dog dog dog"));

	 }
}
