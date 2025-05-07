class GroupAnagrams {
    //Time complexity - o(n*m)
    //Space Complexity - o(n)
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<Double,List<String>> map = new HashMap<Double,List<String>>();
	        List<String> list = null;
	        for(String s:strs){
	        	// char[] ch = s.toCharArray();
	        	// Arrays.sort(ch);
	        	// String mai = String.valueOf(ch);
                Double mai = primeNumbers(s);
                
	            if(!map.containsKey(mai)){
	            	// list = new ArrayList<String>();
	            	// list.add(s);
	                map.put(mai,new ArrayList<String>());
	            } 
                // else{
	            	 map.get(mai).add(s);
	            	// list.add(s);
	            	// map.put(mai,list);
	            // }
	        } 
	        
	        
			return  new ArrayList<List<String>>(map.values());
	    }
    
    public static Double primeNumbers(String str) {
			int[] pr = new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79,
					83, 89, 97, 101 };
			Double key = 1.0;
			char[] c1 = str.toCharArray();
			for (int i = 0; i < c1.length ; i++) {
				int j = c1[i] - 97;
				key = key * pr[j];
			}
			return key;
		}
}