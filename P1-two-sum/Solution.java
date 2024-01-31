import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> s = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (s.containsKey(target - nums[i])) {
                return new int[]{s.get(target - nums[i]), i};
            }
            s.put(nums[i], i);
        }
        return new int[]{};
    }
}