class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        

        HashMap<String, List<String>> anagram = new HashMap<>();

        for(String word : strs){

            char[] ch = word.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);
            List<String> currentGroup = anagram.getOrDefault(key, new ArrayList<>());
            currentGroup.add(word);
            anagram.put(key,currentGroup);
        }
        return new ArrayList<>(anagram.values());
    }
}
