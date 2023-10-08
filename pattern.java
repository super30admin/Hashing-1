import java.util.HashMap;

class pattern {
    public boolean wordPattern(String pattern, String str) {
        String[] arr = str.split(" ");
        char[] charArr = pattern.toCharArray();
        if(arr.length != charArr.length) return false;
        HashMap<String, Character> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(!map.containsKey(arr[i]) && !map.containsValue(charArr[i])){
                map.put(arr[i], charArr[i]);
            }else if(!map.containsKey(arr[i]) && map.containsValue(charArr[i])){
                return false;
            }else{
                if(charArr[i] != map.get(arr[i]))
                    return false;
            }
        }
        return true;
    }

        public static void main(String[] args) {
            pattern obj = new pattern(); // Create an instance of the Solution class
        
            // Call the wordPattern method without specifying parameter names
            System.out.println(obj.wordPattern("abba", "dog cat cat dog"));
        }
        
    
    }

