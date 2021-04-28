public class validAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 97]++;
            counter[t.charAt(i) - 97]--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        validAnagram obj=new validAnagram();
    
        
        System.out.println("Element is missing :"+obj.isAnagram("anagram", "gramana"));

    }

    
}
