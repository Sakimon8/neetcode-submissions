class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean columns[][] = new boolean[9][9];
        boolean rows[][] = new boolean[9][9];
        boolean subMatrix[][] = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int val = board[i][j] - '1';
                    int subMatrixValue = (i / 3) * 3 + j / 3;
                    if (rows[i][val] || columns[j][val] || subMatrix[subMatrixValue][val]) {
                        return false;    
                    }
                    rows[i][val] = true;
                    columns[j][val] = true;
                    subMatrix[subMatrixValue][val] = true;
                }
            }
        }

        return true;
    }
}
