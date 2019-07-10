import java.util.HashMap;

public class SamePattern {
	  public static boolean wordPattern(String s, String t) {
	       
	        HashMap<Integer, String> map = new HashMap<>();
	        String[] target = t.split(" ");
	        if (s.length() != target.length) {
	            return false;
	        }
	        for (int i = 0; i < s.length(); i++) {
	            int patternKey = s.charAt(i);
	            if (map.containsKey(patternKey)) {
	                if (!map.get(patternKey).equals(target[i]))
	                    return false;
	            } else {
	                if (map.containsValue(target[i])) return false;
	                map.put(patternKey, target[i]);
	            }
	        }
	        return true;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(wordPattern("abba","dog cat cat dog"));
		System.out.println(wordPattern("abba","dog cat cat fish"));
		System.out.println(wordPattern("aaaa","dog cat cat dog"));

	}

}