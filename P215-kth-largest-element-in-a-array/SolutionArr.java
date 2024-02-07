class SolutionArr {
    public int findKthLargest(int[] nums, int k) {
        int[] a = new int[2 * 10000 + 1];
        int offset = 10000;

        for (int i = 0; i < nums.length; i++) {
            a[nums[i] + offset] += 1;
        }

        int i = a.length - 1;
        while (k > 0) {
            k -= a[i];
            i--;
        }

        return i - offset + 1;
    }
}