package algorithms;

public class Palindrome {


    static boolean checkPalindrome(String inputString) {

        int lastElementIndex = inputString.length() - 1;


        for (int i = 0; i < inputString.length()/2; i++) {
            if (inputString.charAt(i) != inputString.charAt(lastElementIndex - i)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome("1234567654321"));
    }
}
