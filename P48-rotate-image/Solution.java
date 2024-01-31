class Solution {
    public void rotate(int[][] matrix) {

        for(int j=0;j<matrix.length/2;j++){
            for(int i=j;i<matrix.length-j;i++){
                int temp =  matrix[i][matrix.length-j-1];
                matrix[i][matrix.length-j-1] = matrix[matrix.length-j-1][i];
                int temp2 = matrix[matrix.length-j-1][matrix.length-i-1];
                matrix[matrix.length-j-1][matrix.length-i-1] = temp;
                int temp3 = matrix[matrix.length-i-1][j];
                matrix[matrix.length-i-1][j] = temp2;
                matrix[matrix.length-j-1][i] = temp3;

            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{5,1,9,11},{2, 4, 8, 10},{13, 3, 6, 7},{15,14,12,16}}
                rotate(arr);
    }
}