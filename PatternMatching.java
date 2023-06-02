import java.util.Arrays;
import java.util.HashMap;

public class PatternMatching {
    public boolean wordPattern(String pattern, String s) {
        char[] arr1 = pattern.toCharArray();
        String[] arr2 = s.split(" ");
        // System.out.println("Array1: " + Arrays.toString(arr1));
        // System.out.println("Array2: " + Arrays.toString(arr2));
        if (arr1.length != arr2.length)
            return false;

        HashMap map = new HashMap();

        for (int i = 0; i < arr1.length; i++) {
            char ch = arr1[i];
            String st = arr2[i];
            if (!map.containsKey(ch)) {
                map.put(ch, i);
            }

            if (!map.containsKey(st)) {
                map.put(st, i);
            }
            if (!map.get(ch).equals(map.get(st)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PatternMatching obj = new PatternMatching();
        String pattern = "abba";
        String s = "dog cat cat dog";

        String pattern1 = "abbd";
        String s1 = "dog cat cat dogs";

        System.out.println("Matching for Pattern and S: " + obj.wordPattern(pattern, s));
        System.out.println("Matching for Pattern and S1? " + obj.wordPattern(pattern, s1));
        System.out.println("Matching for Pattern1 and S? " + obj.wordPattern(pattern1, s));
        System.out.println("Matching for Pattern1 and S1? " + obj.wordPattern(pattern1, s1));
    }
}
