class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

      Map<String, List<String> > map = new HashMap<>();


       for(int i=0;i<strs.length;i++) {

        String element = strs[i];
        char[] ch = element.toCharArray();
        Arrays.sort(ch);
        String key = new String(ch);

        List<String>currentList = map.getOrDefault(key, new ArrayList<>());
        
         currentList.add(element);
         map.put(key,currentList);
       }
       return new ArrayList<>(map.values());   
    }
}
