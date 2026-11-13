class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> group = new HashMap<>();


        for(int i=0;i<strs.length;i++) {

            String element = strs[i];
            char[] ch = element.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            List<String> currentList = group.getOrDefault(key, new ArrayList<>());
            currentList.add(element);
            group.put(key, currentList);
        }

        return new ArrayList<>(group.values());
    }
}
