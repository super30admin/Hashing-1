import java.util.Arrays;

public class Word_Pattern {
    public boolean wordPattern(String pattern, String s) {

        String[] mappingCharToString = new String[26];
        Arrays.fill(mappingCharToString, "");
        String[] stringArray = s.split(" ");

        for (int i = 0; i<pattern.length(); i++) {

            System.out.println(mappingCharToString[pattern.charAt(i) - 'a']);

            if (mappingCharToString[pattern.charAt(i) - 'a'] == "") {
                mappingCharToString[pattern.charAt(i) - 'a'] = stringArray[i];
            }

            if (mappingCharToString[pattern.charAt(i) - 'a'] != "" && mappingCharToString[pattern.charAt(i) - 'a'] != stringArray[i]) return false;
        }
        return true;
    }
}
