class Solution {
    public boolean isAnagram(String s, String t) {
            

            if(s.length() < t.length() || s.length()!=t.length()) {
                return false;
            }

            int[] anagram = new int[26];


            for(int i=0;i<s.length();i++) {

                anagram[s.charAt(i)-'a']++;
                anagram[t.charAt(i)-'a']--;
            }

            for(int value : anagram) {
                if(value!=0) {
                    return false;
                }
            }

            return true;
    }
}
