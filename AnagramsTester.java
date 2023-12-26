import java.util.List;

public class AnagramsTester {
    public static void main(String[] args) {
        Anagrams obj = new Anagrams();

        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

        List<List<String>> res = obj.groupAnagrams(strs);

        res.forEach((value) -> {
            System.out.println(value);
        });
    }
}
