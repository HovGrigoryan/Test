package algorithms;

public class Century {
    static int solution(int year) {
        if (year % 100 == 0) {
            return year / 100;
        } else if (year > 100) {
            return year / 100 + 1;
        } else if (year > 0 && year < 100) {
            return 1;
        }
        return -1;
//        int x = year % 100 != 0 ? 1 : 0;
//        return ((year - (year % 100)) / 100) + x;
    }

    public static void main(String[] args) {
        System.out.println(Century.solution(2200));
    }
}
