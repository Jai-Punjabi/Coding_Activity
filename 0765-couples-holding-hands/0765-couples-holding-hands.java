class Solution {
    public int minSwapsCouples(int[] row) {
        int n = row.length;
        int swaps = 0;

        for (int i = 0; i < n; i += 2) {
            int first = row[i];
            int second = first ^ 1; // Get partner of first

            if (row[i + 1] != second) { // If not holding hands
                for (int j = i + 2; j < n; j++) {
                    if (row[j] == second) {
                        // Swap to make them hold hands
                        int temp = row[i + 1];
                        row[i + 1] = row[j];
                        row[j] = temp;
                        swaps++;
                        break;
                    }
                }
            }
        }
        return swaps;
    }
}