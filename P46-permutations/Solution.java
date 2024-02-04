import java.util.ArrayList;
import java.util.List;

class Solution {
    private static void compute(int index, int[] nums, List<List<Integer>> ans) {
        if (index == nums.length) {
            List<Integer> a = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                a.add(nums[j]);
            }
            ans.add(a);
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(index, nums, i);
            compute(index + 1, nums, ans);
            swap(index, nums, i);
        }
    }

    private static void swap(int index, int[] nums, int i) {
        int temp = nums[index];
        nums[index] = nums[i];
        nums[i] = temp;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        compute(0, nums, ans);
        System.gc();
        return ans;
    }
}