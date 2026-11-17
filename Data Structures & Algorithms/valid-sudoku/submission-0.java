class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int size = 0;

        while(size < 9){
            HashSet<Character> row = new HashSet<>();
            for(int i = 0; i < 9;i++){
                if(row.contains(board[size][i])){
                    return false;
                }
                if(board[size][i] != '.'){
                    row.add(board[size][i]);
                }
            }

            HashSet<Character> column = new HashSet<>();
            for(int j = 0; j < 9;j++){
                if(column.contains(board[j][size])){
                    return false;
                }
                if(board[j][size] != '.'){
                    column.add(board[j][size]);
                }
            }

            HashSet<Character> subBox = new HashSet<>();
            int minRow = (size/3) * 3;
            int maxRow = minRow + 2;

            int minCol = (size%3) * 3;
            int maxCol = minCol + 2;

            for(int i = minRow ;i<=maxRow;i++){
                for(int j = minCol; j<=maxCol;j++){
                    if(subBox.contains(board[i][j])){
                        return false;
                    }
                    if(board[i][j] != '.'){
                        subBox.add(board[i][j]);
                    }
                }
            }
            size++;
        }

        return true;
    }
}
