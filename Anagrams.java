import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class Anagrams {

	public static List<List<String>> groupAnagrams(String[] arr){
		HashMap<String,List<String>> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			char[] key = arr[i].toCharArray();
			Arrays.sort(key);
			String sortedKey = String.valueOf(key);
			if(!map.containsKey(sortedKey)) {
				map.put(sortedKey,new ArrayList<String>());	
		}
			map.get(sortedKey).add(arr[i]);
		}
		return new ArrayList<List<String>>(map.values());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> ans = groupAnagrams(arr);
	 System.out.println(ans);

}}