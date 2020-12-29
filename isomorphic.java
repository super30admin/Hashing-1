import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class isomorphic {

	public static int getcount(String word)
	{
		int count1=0;
		int count[]=new int[26];
		for(char c:word.toCharArray())
		{
			count[c -'a']++;
		}
		for(int i=0;i<count.length;i++)
		{
			count1+=count[i];
		}
		System.out.println("count"+count1);
		return count1;
	}
	
public static boolean isIsomorphic(String s, String t) {
        
	Map<Character, Integer> m1 = new HashMap<>();
    Map<Character, Integer> m2 = new HashMap<>();

    for(Integer i = 0; i < s.length(); i++) {
    	
    	System.out.println("check for m1="+m1.put(s.charAt(i), i));
    	System.out.println("check for m2="+m2.put(t.charAt(i), i));
        if(m1.put(s.charAt(i), i) != m2.put(t.charAt(i), i)) {
        	System.out.print("false");
            return false;
        }
        //System.out.println("check"+m1.put(s.charAt(i), i));
    }
    return true;
    }
public static boolean isIsomorphic1(String s1, String s2) {
    Map<Character, Integer> m1 = new HashMap<>();
    Map<Character, Integer> m2 = new HashMap<>();

    for(Integer i = 0; i < s1.length(); i++) {

        if(m1.put(s1.charAt(i), i) != m2.put(s2.charAt(i), i)) {
            return false;
        }
    }
    return true;

}
	
	
	public static void main(String args[])
	{
		isomorphic iso=new isomorphic();
		//System.out.print("count"+iso.getcount("title"));
		System.out.println("check()"+isIsomorphic1("adb","xxy"));
		
	/*	we are comparing references here.
		For simplification lets take s1 = "add", s2 = "egf"

		1st iteration: Integer i = 0, s1.charAt(i) is 'a', s2.charAt(i) is 'e'

		m1.put(s1.charAt(i), i) returns null
		m2.put(s2.charAt(i), i) returns null

		2nd iteration: Integer i = 1, s1.charAt(i) is 'd', s2.charAt(i) is 'g'

		m1.put(s1.charAt(i), i) returns null
		m2.put(s2.charAt(i), i) returns null

		3nd iteration: Integer i = 2, s1.charAt(i) is 'd', s2.charAt(i) is 'f'

		m1.put(s1.charAt(i), i) returns Integer obj ref (value 1)
		m2.put(s2.charAt(i), i) returns null (1 != null returns false;)

		if s2 = "egg" instead of "egf"
		3nd iteration: Integer i = 2, s1.charAt(i) is 'd', s2.charAt(i) is 'g'

		m1.put(s1.charAt(i), i) returns Integer obj ref (value 1)
		m2.put(s2.charAt(i), i) returns Integer obj ref (value 1)
		(same object created during 2nd iteration)

		loop ends and we will return true!*/
	}
}
