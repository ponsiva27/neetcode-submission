class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        String start=strs[0];
        String end= strs[strs.length-1];

         int i=0;
         StringBuilder str = new StringBuilder();

        while(i<start.length() && i<end.length()) {
            
            if(start.charAt(i)==end.charAt(i)) {
                str.append(start.charAt(i));
                i++;
            } else {
                break;
            }
        }
        return str.toString();
    }
}