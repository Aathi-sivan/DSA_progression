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


        //check boxes 
        HashMap<Pair<Integer, Integer>, HashSet<Character>> boxes = new HashMap<>();

for (int i = 0; i < 9; i++) {
    for (int j = 0; j < 9; j++) {

        if (board[i][j] == '.')
            continue;

        Pair<Integer, Integer> key = new Pair<>(i / 3, j / 3);

        if (!boxes.containsKey(key)) {
            boxes.put(key, new HashSet<>());
        }

        HashSet<Character> box = boxes.get(key);

        if (box.contains(board[i][j]))
            return false;

        box.add(board[i][j]);
    }
}
return true;
    }
}
