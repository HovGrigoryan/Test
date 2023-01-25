package algorithms;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Palindrom {
    static boolean solution(String inputString) {
        for (int i = 0; i < inputString.length() / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        try {
//            FileReader fileReader = new FileReader("l.txt");
//        } catch (FileNotFoundException e) {
//            String a = null;
//            System.out.println(a.length());
//        }catch (NullPointerException e){
//            e.printStackTrace();
//        }
        System.out.println(Palindrom.solution("dabbad"));
    }
}
