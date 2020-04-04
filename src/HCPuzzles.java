public class HCPuzzles {
    public int[] xWingRow = {9, 8, 0, 0, 6, 2, 7, 5, 3,
            0, 6, 5, 0, 0, 3, 0, 0, 0,
            3, 2, 7, 0, 5, 0, 0, 0, 6,
            7, 9, 0, 0, 3, 0, 5, 0, 0,
            0, 5, 0, 0, 0, 9, 0, 0, 0,
            8, 3, 2, 0, 4, 5, 0, 0, 9,
            6, 7, 3, 5, 9, 1, 4, 2, 8,
            2, 4, 9, 0, 8, 7, 0, 0, 5,
            5, 1, 8, 0, 2, 0, 0, 0, 7};

    public int[] puzzle = {0, 6, 0, 3, 0, 0, 8, 0, 4,
            5, 3, 7, 0, 9, 0, 0, 0, 0,
            0, 4, 0, 0, 0, 6, 3, 0, 7,
            0, 9, 0, 0, 5, 1, 2, 3, 8,
            0, 0, 0, 0, 0, 0, 0, 0, 0,
            7, 1, 3, 6, 2, 0, 0, 4, 0,
            3, 0, 6, 4, 0, 0, 0, 1, 0,
            0, 0, 0, 0, 6, 0, 5, 2, 3,
            1, 0, 2, 0, 0, 9, 0, 8, 0};

    public int[] rowBlockTest = {0, 0, 0, 0, 7, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 2, 0, 1, 0, 0, 0,
            5, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 9, 0, 6, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0};

    public int[] blockBlockRowTest = {0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 8, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0,
            2, 9, 0, 0, 1, 4, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 8, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0};

    private int[] hardest = {0, 0, 0, 7, 0, 0, 0, 0, 0,
            1, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 4, 3, 0, 2, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 6,
            0, 0, 0, 5, 0, 9, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 4, 1, 8,
            0, 0, 0, 0, 8, 1, 0, 0, 0,
            0, 0, 2, 0, 0, 0, 0, 5, 0,
            0, 4, 0, 0, 0, 0, 3, 0, 0};

    public int[] hardestPuzzle = {8, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 3, 6, 0, 0, 0, 0, 0,
            0, 7, 0, 0, 9, 0, 2, 0, 0,
            0, 5, 0, 0, 0, 7, 0, 0, 0,
            0, 0, 0, 0, 4, 5, 7, 0, 0,
            0, 0, 0, 1, 0, 0, 0, 3, 0,
            0, 0, 1, 0, 0, 0, 0, 6, 8,
            0, 0, 8, 5, 0, 0, 0, 1, 0,
            0, 9, 0, 0, 0, 0, 4, 0, 0};

    public int[] blockBlockColTest = {0, 0, 0, 0, 2, 0, 0, 0, 0,
            0, 0, 0, 0, 9, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 8, 0,
            0, 8, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 1, 0, 0, 0, 0,
            0, 0, 0, 0, 4, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0};

    public int[] medium = {0, 4, 0, 0, 0, 2, 0, 1, 9,
            0, 0, 0, 3, 5, 1, 0, 8, 6,
            3, 1, 0, 0, 9, 4, 7, 0, 0,
            0, 9, 4, 0, 0, 0, 0, 0, 7,
            0, 0, 0, 0, 0, 0, 0, 0, 0,
            2, 0, 0, 0, 0, 0, 8, 9, 0,
            0, 0, 9, 5, 2, 0, 0, 4, 1,
            4, 2, 0, 1, 6, 9, 0, 0, 0,
            1, 6, 0, 8, 0, 0, 0, 7, 0};

    public int[] automorphic = {0, 0, 0, 2, 1, 0, 0, 0, 0,
            0, 0, 7, 3, 0, 0, 0, 0, 0,
            0, 5, 8, 0, 0, 0, 0, 0, 0,
            4, 3, 0, 0, 0, 0, 0, 0, 0,
            2, 0, 0, 0, 0, 0, 0, 0, 8,
            0, 0, 0, 0, 0, 0, 0, 7, 6,
            0, 0, 0, 0, 0, 0, 2, 5, 0,
            0, 0, 0, 0, 0, 7, 3, 0, 0,
            0, 0, 0, 0, 9, 8, 0, 0, 0};

    public int[] hiddenTriple = {5, 2, 8, 6, 0, 0, 0, 4, 9,
            1, 3, 6, 4, 9, 0, 0, 2, 5,
            7, 9, 4, 2, 0, 5, 6, 3, 0,
            0, 0, 0, 1, 0, 0, 2, 0, 0,
            0, 0, 7, 8, 2, 6, 3, 0, 0,
            0, 0, 2, 5, 0, 9, 0, 6, 0,
            2, 4, 0, 3, 0, 0, 9, 7, 6,
            9, 0, 9, 7, 0, 2, 4, 1, 3,
            0, 7, 0, 9, 0, 4, 5, 8, 2};

    public int[] empty = {0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0,};

    public int[] xWingCol = {0, 4, 1, 7, 2, 9, 0, 3, 0,
            7, 6, 9, 0, 0, 3, 4, 0, 2,
            0, 3, 2, 6, 4, 0, 7, 1, 9,
            4, 0, 3, 9, 0, 0, 1, 7, 0,
            6, 0, 7, 0, 0, 4, 9, 0, 3,
            1, 9, 5, 3, 7, 0, 0, 2, 4,
            2, 1, 4, 5, 6, 7, 3, 9, 8,
            3, 7, 6, 0, 9, 0, 5, 4, 1,
            9, 5, 8, 4, 3, 1, 2, 6, 7};

    public int[] generated1 = {0, 4, 3, 6, 0, 0, 0, 8, 0,
            5, 0, 8, 9, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 5, 3,
            1, 0, 5, 4, 7, 6, 8, 2, 0,
            0, 0, 0, 0, 5, 0, 1, 0, 0,
            0, 0, 0, 0, 8, 2, 0, 6, 0,
            0, 8, 1, 0, 6, 3, 4, 0, 0,
            3, 0, 0, 0, 4, 8, 0, 0, 2,
            0, 0, 6, 0, 0, 0, 0, 0, 0};

    public int[] generated2 = {0, 0, 0, 2, 0, 1, 0, 0, 0,
            0, 0, 8, 0, 0, 0, 9, 0, 0,
            2, 0, 9, 0, 4, 0, 0, 0, 0,
            0, 1, 5, 0, 7, 0, 6, 8, 9,
            6, 7, 0, 1, 0, 0, 0, 0, 0,
            0, 8, 2, 0, 6, 5, 1, 3, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 1,
            0, 0, 0, 0, 0, 8, 3, 2, 6,
            3, 0, 1, 0, 0, 0, 0, 5, 4};

    public void setCandsForHiddenTriple(Cell[][] grid, int col) {
        // Col needs to be 4
        for (Cell[] cell : grid) {
            if (cell[col].pos / 9 == 0) {
                cell[col].candidates[1] = false;
                cell[col].candidates[3] = false;
                cell[col].candidates[4] = false;
                cell[col].candidates[5] = false;
                cell[col].candidates[7] = false;
                cell[col].candidates[8] = false;
            }
            if (cell[col].pos / 9 == 1) {
                cell[col].candidates[0] = false;
                cell[col].candidates[1] = false;
                cell[col].candidates[2] = false;
                cell[col].candidates[3] = false;
                cell[col].candidates[4] = false;
                cell[col].candidates[5] = false;
                cell[col].candidates[6] = false;
                cell[col].candidates[7] = false;
                cell[col].candidates[8] = false;
            }
            if (cell[col].pos / 9 == 2) {
                cell[col].candidates[1] = false;
                cell[col].candidates[2] = false;
                cell[col].candidates[3] = false;
                cell[col].candidates[4] = false;
                cell[col].candidates[5] = false;
                cell[col].candidates[6] = false;
                cell[col].candidates[8] = false;
            }
            if (cell[col].pos / 9 == 3) {
                cell[col].candidates[0] = false;
                cell[col].candidates[1] = false;
                cell[col].candidates[4] = false;
                cell[col].candidates[5] = false;
                cell[col].candidates[7] = false;
                cell[col].candidates[8] = false;
            }
            if (cell[col].pos / 9 == 4) {
                cell[col].candidates[0] = false;
                cell[col].candidates[1] = false;
                cell[col].candidates[2] = false;
                cell[col].candidates[3] = false;
                cell[col].candidates[4] = false;
                cell[col].candidates[5] = false;
                cell[col].candidates[6] = false;
                cell[col].candidates[7] = false;
                cell[col].candidates[8] = false;
            }
            if (cell[col].pos / 9 == 5) {
                cell[col].candidates[0] = false;
                cell[col].candidates[1] = false;
                cell[col].candidates[4] = false;
                cell[col].candidates[5] = false;
                cell[col].candidates[7] = false;
                cell[col].candidates[8] = false;
            }
            if (cell[col].pos / 9 == 6) {
                cell[col].candidates[1] = false;
                cell[col].candidates[2] = false;
                cell[col].candidates[3] = false;
                cell[col].candidates[5] = false;
                cell[col].candidates[6] = false;
                cell[col].candidates[8] = false;
            }
            if (cell[col].pos / 9 == 7) {
                cell[col].candidates[0] = false;
                cell[col].candidates[1] = false;
                cell[col].candidates[2] = false;
                cell[col].candidates[3] = false;
                cell[col].candidates[6] = false;
                cell[col].candidates[7] = false;
                cell[col].candidates[8] = false;
            }
            if (cell[col].pos / 9 == 8) {
                cell[col].candidates[1] = false;
                cell[col].candidates[2] = false;
                cell[col].candidates[3] = false;
                cell[col].candidates[4] = false;
                cell[col].candidates[6] = false;
                cell[col].candidates[7] = false;
                cell[col].candidates[8] = false;
            }


            if (cell[col].pos / 9 == 100) {
                cell[col].candidates[0] = false;
                cell[col].candidates[1] = false;
                cell[col].candidates[2] = false;
                cell[col].candidates[3] = false;
                cell[col].candidates[4] = false;
                cell[col].candidates[5] = false;
                cell[col].candidates[6] = false;
                cell[col].candidates[7] = false;
                cell[col].candidates[8] = false;
            }
        }
    }
}