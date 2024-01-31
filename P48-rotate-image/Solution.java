import java.util.Arrays;

class Solution {
    public static void rotate(int[][] matrix) {

        for (int j = 0; j < matrix.length / 2; j++) {
            int endIndex = matrix.length - j - 1;
            for (int i = j; i < endIndex; i++) {
                int currentIndex = matrix.length - i - 1;
                int right = matrix[i][endIndex];
                matrix[i][endIndex] = matrix[j][i];
                int bottom = matrix[endIndex][currentIndex];
                matrix[endIndex][currentIndex] = right;
                int left = matrix[currentIndex][j];
                matrix[currentIndex][j] = bottom;
                matrix[j][i] = left;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        rotate(arr);
        Arrays.stream(arr).map(Arrays::toString).forEach(System.out::println);
    }
}