class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int start=0;
        int s2 =0;

        StringBuilder str = new StringBuilder();

        while(start<word1.length() && s2<word2.length()){
             
            str.append(word1.charAt(start)).append(word2.charAt(s2));
            start++;
            s2++;
        }
        
        while(start!=word1.length()){
            str.append(word1.charAt(start));
            start++;
        }
        while(s2!=word2.length()){
            str.append(word2.charAt(s2));
            s2++;
        }
        return str.toString();

    }
}