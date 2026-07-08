package Practices;

public class prefixsum2d {
    public static int[][] calculatePrefixSum(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int[][] prefixSum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                prefixSum[i][j] = array[i][j];

                if (i > 0) {
                    prefixSum[i][j] += prefixSum[i - 1][j];
                }
                if (j > 0) {
                    prefixSum[i][j] += prefixSum[i][j - 1];
                }
                if (i > 0 && j > 0) {
                    prefixSum[i][j] -= prefixSum[i - 1][j - 1];
                }
            }
        }

        return prefixSum;
    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] prefixSum = calculatePrefixSum(array);

        // Print the prefix sum array
        for (int i = 0; i < prefixSum.length; i++) {
            for (int j = 0; j < prefixSum[i].length; j++) {
                System.out.print(prefixSum[i][j] + " ");
            }
            System.out.println();
        }
    }

}
