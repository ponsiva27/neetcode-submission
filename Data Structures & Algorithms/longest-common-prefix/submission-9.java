class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        String s = strs[0];
        String e =strs[strs.length-1];

        StringBuilder str = new StringBuilder();
        int i=0;
        while(i<s.length() && i<e.length()) {
             
            if(s.charAt(i)!=e.charAt(i)) {
                break;
            } else {
                str.append(s.charAt(i));
                i++;
            }
        } 
        return str.toString();
    }
}