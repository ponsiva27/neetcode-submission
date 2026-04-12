class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        if(word1==null) {
            return word2;
        } else if(word2==null){
            return word1;
        }

        int p1=0, p2=0;

        int n=word1.length();
        int m=word2.length();

        StringBuilder str = new StringBuilder();

        while(p1<n && p2<m) {
            
            str.append(word1.charAt(p1)).append(word2.charAt(p2));
            p1++;
            p2++;
        }

        while(p1<n) {
            str.append(word1.charAt(p1));
            p1++;
        }

        while(p2<m){
            str.append(word2.charAt(p2));
                p2++;
        }
        return str.toString();
    }
}