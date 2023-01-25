package leetCode.odd;

public class Run {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{4, 2, 5, 7};
        int[] ints = solution.sortArrayByParityII(nums);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
