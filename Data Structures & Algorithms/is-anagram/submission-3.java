class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // ----------------------------------------------------
        // --- THIS IS THE MISSING PART ---
        // 1. Build the frequency map for string 's'
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Get the current count (or 0 if not present), add 1, and put it back
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // ----------------------------------------------------

        // 2. Now, check string 't' against the map
        for (int j = 0; j < t.length(); j++) {
            char c = t.charAt(j);

            // Case 1: t has a char s doesn't (or t has more of that char than s)
            // We can combine the checks: if the key isn't there, or its count is 0, fail.
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }

            // Otherwise, decrement the count
            map.put(c, map.get(c) - 1);
        }

        // If the loop finishes, all characters matched
        return true;
    }
}
