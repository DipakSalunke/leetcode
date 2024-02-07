import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0; i<nums.length; i++){
            pq.add(nums[i]);
        }
        for(int i = 0; i<k-1; i++){
            pq.remove();
        }
        return pq.remove();
    }

    public static void main(String[] args) {
       // System.out.println(findKthLargest(new int[]{5,4,3,2,7,6,1,8}, 3));
        System.out.println(findKthLargest(new int[]{1}, 1));
    }
}