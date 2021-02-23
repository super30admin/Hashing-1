private static final int[] PRIMES = new int[]{2, 3, 5, 7, 11 ,13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 107};
    
    public List<String> anagrams(String[] strs) {
        List<String> list = new LinkedList<>();
        Map<Integer, List<String>> mapString = new HashMap<>();
        int result = -1;
        for (int i = 0; i < strs.length; i++){
            int mapping = 1;
            for (int j = 0, max = strs[i].length(); j < max; j++) {
                mapping *= PRIMES[strs[i].charAt(j) - 'a'];
            }
            List<String> strings = mapString.get(mapping);
            if (strings == null) {
                strings = new LinkedList<>();
                mapString.put(mapping, strings);
            }
            strings.add(strs[i]);
        }
        for (List<String> mapList : mapString.values()){
            if (mapList.size() > 1)
                list.addAll(mapList);
        }
        return list;
    }