class Solution {
    public static int NthRoot(int n, int m) {
        // code here
        double mult = 0;
        int count = 0;
        while (mult < m) {
            mult = Math.pow(++count, n);
        }
        if (mult == m) return count;
        else return -1;
    }

    public static void main(String[] args) {
        System.out.println(NthRoot(4, 1));
    }
}