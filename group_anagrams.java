import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class group_anagrams {
	
	public List<List<String>> groupanagram(String[] arr){
		
		HashMap<String, List> map = new HashMap();
		for(String x: arr) {
			char[] x1 = x.toCharArray();
			Arrays.sort(x1);
			String ca = String.valueOf(x1);
			if(!map.containsKey(ca))
			{
				map.put(ca, new ArrayList());
			}
			map.get(ca).add(x);
		}
		return new ArrayList(map.values());
		
	}
	
	public static void main(String[] args) {
		group_anagrams ga = new group_anagrams();
		String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(ga.groupanagram(str));
	}

}
