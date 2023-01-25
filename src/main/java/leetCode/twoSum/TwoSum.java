package leetCode.twoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result[0] = i;
                result[1] = map.get(nums[i]);
            } else {
                map.put(target - nums[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = new int[]{7, 4, 2, 1};
        int target = 9;
        int[] ints = TwoSum.twoSum(nums, target);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }

}
