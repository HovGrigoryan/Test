package problemsWithGevor;

public class FindSumOfNumbersDigits {

    public static int findSumOfNumbersDigits(int num) {
//        int sum = 0;
//        while (num != 0) {
//            int value = num % 10;
//            num = num / 10;
//            sum = sum + value;
//        }
//        return sum;

        return num == 0 ? 0 : num % 10 + findSumOfNumbersDigits(num / 10);


    }


    public static void main(String[] args) {
        System.out.println(findSumOfNumbersDigits(770022));
    }
}
