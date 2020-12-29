import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Annagrams {
	
	public int getcountid(String word)
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
	
		return Arrays.hashCode(count);
	}

 public List<List<String>> groupAnagrams(String[] strs) {
	 
	 Map<Integer,List<String>> anagram=new HashMap<>();
	 List<List<String>> groups   =   new ArrayList<>();
	 
	 for(String word:strs)
	 {
		 List<String> samewords=new ArrayList<>();
	 
		 int id=getcountid(word);
		 if(samewords==null) {
			  samewords  =   new ArrayList();
			  anagram.put(id,samewords);
		 }
		samewords.add(word);
	 }
	 return groups;
		 
		 }
	 }
	 

 
 
 
