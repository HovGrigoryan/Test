package algorithms;

public class MaxProduct {

    static int solution(int[] inputArray) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] * inputArray[i + 1] > max) {
                max = inputArray[i] * inputArray[i + 1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] myNum = {-23, 4, -3, 8, -12};
        System.out.println(MaxProduct.solution(myNum));
    }
}
