package Core;

public class Test {
    public static void main(String[] args) {
        int a = 11;
        int b = 8;
        a = a ^ b;
        System.out.println(a + " first");
        b = b ^ a;
        System.out.println(b + " second");
        a = a ^ b;
        System.out.println(a + " third");
        System.out.println(a + " a " + b + " b");
    }


}
