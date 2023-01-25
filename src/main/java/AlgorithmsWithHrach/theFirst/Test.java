package AlgorithmsWithHrach.theFirst;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {

    public static boolean isMassiveContain(int[] a, int number) {
        boolean isContain = false;

//        a = sortArray(a);

//        for (int i = 0; i < a.length; i++)
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[i] + a[j] == number) {
//                    return true;
//                }
//            }
        Set<Integer> set = new HashSet<>();
        for (int i : a) {
            int value = number - i;
            if (set.contains(value)) {
                return true;
            }
            set.add(i);


        }
        return false;
    }

    public static boolean isTwin(String a, String b) {
//        if (a.length() != b.length()) return false;
//        List<Character> aC = new ArrayList<>();
//        List<Character> bC = new ArrayList<>();
//        for (int i = 0; i < a.length(); i++) {
//            aC.add(a.toLowerCase().charAt(i));
//            bC.add(b.toLowerCase().charAt(i));
//        }
//        for (int i = 0; i < aC.size(); i++) {
//            bC.remove(aC.get(i));
//        }
//        return bC.isEmpty();

        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        Arrays.sort(aChars);
        Arrays.sort(bChars);
        return Arrays.equals(aChars,bChars);
    }


//    }


//        Arrays.stream(a).anyMatch((a+b-> number))
//        return false;
//}

    private static int[] sortArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean hasChange = false;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    hasChange = true;
                }
            }
            if (!hasChange) {
                break;
            }
        }

        for (int i : a) {
            System.out.println(i);
        }
        return new int[0];
    }

    public static void main(String[] args) {

        System.out.println(isTwin("Hello", "OaleH"));
        System.out.println(isTwin("barabara", "rababara"));
    }
}
