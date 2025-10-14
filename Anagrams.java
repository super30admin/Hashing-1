class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char [] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String s = String.valueOf(arr);

            if(map.containsKey(s)){
                List<String> list = map.get(s);
                list.add(strs[i]);
                map.put(s,list);
            }

            else{
                List<String> list = new ArrayList<String>();
                list.add(strs[i]);
                map.put(s,list);
            }     
            System.out.println(arr);   
        }

        

        List<List<String>> st = new ArrayList<>();
        
        for (Map.Entry<String,List<String>> mapElement : map.entrySet()) {
            st.add(mapElement.getValue());
            
        }
        return st;       
    }
}