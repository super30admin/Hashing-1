
//time complexity - O(n)
//space complexity - O(n)

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> hasma = new HashMap<>();
        Set<Character> hash_Set1 = new HashSet<Character>();
        Set<String> hash_Set2 = new HashSet<String>();

        boolean returnValue = false;
        if(pattern.length()==1){
            return true;
        }
        List<String> t = Arrays.asList(s.split(" "));
        if (pattern.length() != t.size()){
            return false;
        }
        for (int i = 0;i < pattern.length();i++){
            if(!hasma.containsKey(pattern.charAt(i))){
                hasma.put(pattern.charAt(i),t.get(i));
                hash_Set2.add(t.get(i));
                hash_Set1.add(pattern.charAt(i));


            }
            if (hasma.containsKey(pattern.charAt(i))){
                if (hasma.get(pattern.charAt(i)).equals(t.get(i))){
                    returnValue = true;
                }
                else{
                    returnValue = false;
                    break;
                }


            }

        }
        System.out.println(hasma);

        if(hash_Set1.size()!=hash_Set2.size()){
            return false;
        }
        return returnValue;


    }
}


//time complexity - O(n)
//space complexity - O(n)

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> hasma = new HashMap<>();
        Set<Character> hash_Set1 = new HashSet<Character>();
        Set<Character> hash_Set2 = new HashSet<Character>();

        boolean returnValue = false;
        if(s.length()==1){
            return true;
        }
        if (s.equals(t)){
            return true;
        }
        for (int i = 0;i < s.length();i++){
            if(!hasma.containsKey(s.charAt(i))){
                hasma.put(s.charAt(i),t.charAt(i));
                hash_Set1.add(t.charAt(i));
                hash_Set2.add(s.charAt(i));


            }
            if (hasma.containsKey(s.charAt(i))){
                if (hasma.get(s.charAt(i)) == t.charAt(i)){
                    returnValue = true;
                }
                else{
                    returnValue = false;
                    break;
                }


            }

        }
        if(hash_Set1.size()!=hash_Set2.size()){
            return false;
        }
        return returnValue;

    }
}


//time complexity - O(nklogk)
//space complexity - O(n)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, ArrayList<String>> articleMapOne = new HashMap<>();

        for (int i =0; i< strs.length;i++){

            if (strs[i].length() == 0){
                ArrayList<String> val = articleMapOne.get(-1);
                if (val == null){
                    val = new ArrayList<String>();
                    articleMapOne.put(-1,val);
                }
                val.add(strs[i]);

            }
            else{
                String[] array = strs[i].split("");
                Arrays.sort(array);

                StringBuilder sb = new StringBuilder();
                for (String ch: array) {
                    sb.append(ch);
                }

                int asciiValue = 7;
                for (int l = 0; l < array.length; l++) {
                    asciiValue = asciiValue*31 + sb.charAt(l);
                }

                ArrayList<String> val = articleMapOne.get(asciiValue);

                if(val == null) {
                    val = new ArrayList<String>();
                    articleMapOne.put(asciiValue, val);
                }
                val.add(strs[i]);
            }


        }

        return new ArrayList<>(articleMapOne.values());
    }
}