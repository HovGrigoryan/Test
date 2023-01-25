package leetCode.odd;


class Solution {

    int[] nums = new int[]{4, 2, 5, 7};

    public int[] sortArrayByParityII(int[] nums) {
        int Arr = nums.length;
        int[] ans = new int[Arr];

        int number = 0;
        for (int x : nums) {
            if (x % 2 == 0) {
                ans[number] = x;
                number += 2;
            }
        }

        number = 1;
        for (int x : nums) {
            if (x % 2 == 1) {
                ans[number] = x;
                number += 2;
            }
        }


        return ans;
    }


}



