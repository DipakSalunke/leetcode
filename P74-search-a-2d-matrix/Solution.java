import java.util.Arrays;

class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int columns = matrix[0].length;
        int high = matrix.length * columns - 1;
        while (low <= high) {
            int indexMid = (low + high) / 2;
            int mid = matrix[indexMid / columns][indexMid % columns];
            if (mid == target) return true;
            if (mid < target) low = indexMid + 1;
            if (mid > target) high = indexMid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] test1 = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int[][] test2 = {{1}, {2}};
        System.out.println(searchMatrix(test2, 2));
    }
}