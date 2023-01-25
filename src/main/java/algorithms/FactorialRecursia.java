package algorithms;

public class FactorialRecursia {

    public static void main(String[] args) {
        System.out.println(fact(4));
        System.out.println(factR(7));
        System.out.println(fib(5));
    }

    public static int fact(int n) {
        int count = 1;
        for (int i = 2; i <= n; i++) {
            count = count * i;
        }
        return count;
    }

    public static int factR(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factR(n - 1);
    }

    public static int fib(int n) {
        if (n == 0 || n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
