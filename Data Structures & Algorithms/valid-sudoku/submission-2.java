class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        //verifying rows
        for(int i = 0 ; i < 9 ; i++){
            HashMap <Character,Integer> rows = new HashMap<>();
            for(int j =0 ; j< 9 ; j++){
                if(board[i][j] != '.'){
                    if(rows.containsKey(board[i][j]))
                        return false;
                    else
                        rows.put(board[i][j],j);
                }
            }
        }

        //verifying coloumns 
        for(int j = 0 ; j < 9 ; j++){
            HashMap <Character,Integer> cols = new HashMap<>();
            for(int i =0 ; i < 9 ; i++){
                if(board[i][j] != '.'){
                    if(cols.containsKey(board[i][j]))
                        return false;
                    else
                        cols.put(board[i][j],j);
                }
            }
        }


         for (int grid = 0; grid < 9; grid++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int rowIndex = (grid / 3) * 3 + i;
                    int colIndex = (grid % 3) * 3 + j;
                    char current = board[rowIndex][colIndex];
                    if (current == '.') {
                        continue;
                    }
                    if (seen.contains(current)) {
                        return false;
                    }
                    seen.add(current);
                }
            }
        }
        return true;
    }
}
