package problemsWithGevor;

import java.util.HashMap;

public class FindRepeatLetters {

    public static String findRepeatLetters(String sentence) {
        System.out.println(sentence);
        char[] chars = sentence.toCharArray();
        for (char aChar : chars) {
            if (aChar == ' ') {
                continue;
            }
            HashMap<String, Integer> map = new HashMap<>();
            
        }
        return sentence;
    }

    public static void main(String[] args) {
        findRepeatLetters("Es qez sirum em");
    }
}
