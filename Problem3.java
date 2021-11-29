//Given a pattern and a string str, find if str follows the same pattern

//time complexity : o(n)
//space complexity : o(n)
public class problem3 {
         
    String[] str = s.split(" ");
    if(pattern.length()!=str.length){
        return false;
    }
    Map<String,String> map  = new HashMap<>();   
    for(int i=0;i<pattern.length();i++){
        String c = String.valueOf(pattern.charAt(i)).toUpperCase();
        if(map.containsKey(c)){
            if(!map.get(c).equals(str[i])){
                return false;
            }
        }else{
            map.put(c,str[i]);
        }
        if(map.containsKey(str[i])){
            if(!map.get(str[i]).equals(c)){
                return false;
            }}else{
                map.put(str[i],c);
            }
        
    }
    return true;
}
