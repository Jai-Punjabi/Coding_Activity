class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][2];
        int index = 0;

        int[] dr = {0, 1, 0, -1}; // Direction vectors for right, down, left, up
        int[] dc = {1, 0, -1, 0};
        int dir = 0; // Start facing east

        int steps = 1; // Number of steps in current direction
        int stepCount = 0; // Counter for steps taken in current direction

        result[index++] = new int[]{rStart, cStart};

        while (index < rows * cols) {
            for (int i = 0; i < steps; i++) {
                rStart += dr[dir];
                cStart += dc[dir];

                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                    result[index++] = new int[]{rStart, cStart};
                }
            }

            stepCount++;
            if (stepCount == 2) { // Change direction after every two segments
                stepCount = 0;
                steps++; // Increase steps after every two segments
            }
            dir = (dir + 1) % 4; // Change direction clockwise
        }

        return result;
    }
}