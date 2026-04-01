class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> anagramGroup = new HashMap<>();

        for(String word : strs){

             char[] c = word.toCharArray();
             Arrays.sort(c);
             String key = new String(c);

            List<String> currentGroup=anagramGroup.getOrDefault(key,new ArrayList<>());

            currentGroup.add(word);

            anagramGroup.put(key,currentGroup);
        }
        return new ArrayList<>(anagramGroup.values());
    }
}
