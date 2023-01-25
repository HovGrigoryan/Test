import java.util.HashMap;
import java.util.Map;

public class NumberStatsInArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 5, 8, 4, 3, 2, 3, 6, 4, 8, 9, 4, 2, 2, 2, 2};
        Integer topFrequentNumbers = findTopFrequent(array, 4);
        System.out.println("Top frequent: " + topFrequentNumbers);
        System.out.println("get digits sum " + getDigitsSum(571022));
        int a = 0113;
        System.out.println(a);
        short i = 130;
        byte j = (byte) i;
        System.out.println(j + "asdasdasdsadasd");
        //Expected: Top frequent: [2, 3, 4, 5]
    }

    private static Integer findTopFrequent(int[] array, int limit) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            hashMap.compute(array[i], (key, value) -> {
                if (value == null) {
                    return 1;
                } else {
                    return ++value;
                }
            });

        }
        int currentValue = 0;
        int lastCount = 0;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            Integer currentCount = entry.getValue();
            if (currentCount > lastCount) {
                currentValue = entry.getKey();
                lastCount = currentCount;
            }
        }
        return currentValue;
    }

    private static Integer getDigitsSum(Integer input) {
//        String var = Integer.toString(input);
//        String[] split = var.split("");
//        for (int i = 0; i < split.length; i++) {
//            Integer value = Integer.valueOf(split[i]);
//            Integer sum = null;
//            sum += value;

        int sum = 0;
        while (input != 0) {
            sum += input % 10;
            input = input / 10;
        }

        return sum;
    }


}


