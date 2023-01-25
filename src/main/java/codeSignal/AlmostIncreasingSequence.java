package codeSignal;

import java.util.Arrays;
import java.util.Collections;

public class AlmostIncreasingSequence {

    //    public static Boolean sequence(int[] seq) {
//        boolean flag = true;
//        for (int i = 0; i < seq.length - 1; i++) {
//            if (seq[i] >= seq[i + 1]) {
//                if (i != seq.length - 2 && seq[i] == seq[i + 2]) {
//                    return false;
//                }
//                if (!flag) {
//                    return flag;
//                }
//                flag = false;
//            }
//
//        }
//        return true;
//    }

    static boolean sequence(int[] sequence) {
        int numErr = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] - sequence[i + 1] >= 0) {
                numErr += 1;
                if (i - 1 >= 0 && i + 2 <= sequence.length - 1
                        && sequence[i] - sequence[i + 2] >= 0
                        && sequence[i - 1] - sequence[i + 1] >= 0) {
                    return false;
                }
            }
        }
        return numErr <= 1;
    }

    public static void main(String[] args) {
        int[] seq = {1, 2, 1, 2};
        System.out.println(sequence(seq));
    }
}
