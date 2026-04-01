class Solution {
    public String mergeAlternately(String word1, String word2) {

       StringBuilder str = new StringBuilder();
       
        int start=0;
        int p1=0;
        int p2=0;

        while(start< word1.length() && start < word2.length()) {
            
            if(p1<word1.length()) {
                str.append(word1.charAt(p1));
                p1++;      
            } 
            if (p2<word2.length()) {
                 str.append(word2.charAt(p2));
                    p2++;
            }
            start++;
        }

        if(p1!=word1.length()){
            str.append(word1.substring(p1,word1.length()));
        }

        if(p2!=word2.length()) {
            str.append(word2.substring(p2,word2.length()));
        }
        return str.toString();
    }
}