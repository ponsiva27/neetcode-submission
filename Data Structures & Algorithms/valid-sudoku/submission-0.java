class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        // 1. Initialize the three trackers: 9 sets for each domain.
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // 2. Iterate through the entire board (O(N^2) where N=9)
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                
                char number = board[r][c];
                
                // Skip empty cells ('.') as they don't violate the rule.
                if (number == '.') {
                    continue;
                }
                
                // Calculate the box index (0 through 8)
                int boxIndex = (r / 3) * 3 + (c / 3);
                
                // 3. Check for Duplicates in all three domains:
                
                // Check Row
                if (rows[r].contains(number)) {
                    return false;
                }
                rows[r].add(number);
                
                // Check Column
                if (cols[c].contains(number)) {
                    return false;
                }
                cols[c].add(number);
                
                // Check Box
                if (boxes[boxIndex].contains(number)) {
                    return false;
                }
                boxes[boxIndex].add(number);
            }
        }
        
        // If the entire board is scanned without finding duplicates, it's valid.
        return true;
    }
}
