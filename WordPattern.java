import java.util.HashMap;
public class WordPattern {
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    public boolean wordPattern(String pattern, String s) {
       
       String[] str = s.split(" ");
       if(str.length!=pattern.length())
       {
        return false;
       }
       else
       {
        HashMap<Character,String> hm = new HashMap<>(); // Char to string Mapping
        HashMap<String,Character> _hm = new HashMap<>(); // String to Char Mapping

        //Loop to check Unique Char to String Mapping and  Unique String to Char Mapping
 
        for(int i=0;i<pattern.length();i++)
        {
            if(hm.containsKey(pattern.charAt(i)))
            {
                if(!str[i].equals(hm.get(pattern.charAt(i)))){
                    return false;
                }
            }
            else
            {
                hm.put(pattern.charAt(i),str[i]);
            }
        
            if(_hm.containsKey(str[i]))
            {
                if(pattern.charAt(i)!=_hm.get(str[i])){
                    return false;
                }
            }
            else
            {
                _hm.put(str[i],pattern.charAt(i));
            }
        }
        return true;
       }
       
 
    }
}

