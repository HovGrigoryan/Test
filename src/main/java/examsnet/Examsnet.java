package examsnet;

import io.vavr.control.Try;

public class Examsnet {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder(5);
        String s = "";
        Var var = new Var();
        System.out.println(var.divideS(10, 0));
    }
}

class Var {

    int divide(int dividend, int divisor) {
        // throws if divisor is zero
        return dividend / divisor;
    }

    Try<Integer> divideS(Integer dividend, Integer divisor) {
        return Try.of(() -> dividend / divisor);
    }


}
