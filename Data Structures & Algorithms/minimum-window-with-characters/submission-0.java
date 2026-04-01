class Solution {
    public String minWindow(String s, String t) {
        
        HashMap<Character,Integer> targetMap = new HashMap<>();

        HashMap<Character,Integer> miniMap = new HashMap<>();

            for(int i=0;i<t.length();i++){
                targetMap.put(t.charAt(i),targetMap.getOrDefault(t.charAt(i),0)+1);
            }

            int required=targetMap.size();
            int matches=0;
            int left=0;
            int minLen = Integer.MAX_VALUE;
            int minStart=0;
            for(int i=0;i<s.length();i++){

              miniMap.put(s.charAt(i),miniMap.getOrDefault(s.charAt(i),0)+1);

                
                 if(targetMap.containsKey(s.charAt(i))  &&  miniMap.get(s.charAt(i)).
                     equals(targetMap.get(s.charAt(i))) 
                        ) {
                        matches++;
                 }

                 while(required==matches) {
                        if(i-left+1 < minLen){
                            minLen = i-left+1;
                            minStart =left;
                        }
                    char evict =s.charAt(left);
                    miniMap.put (evict,miniMap.get(evict)-1);

                    if(targetMap.containsKey(evict)   && 
                       miniMap.get(evict) < targetMap.get(evict)) {
                         matches--;
                       }
                    left++;
                 }
            }
            return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart,minStart+minLen);
    }
}
