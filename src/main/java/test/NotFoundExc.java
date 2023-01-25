package test;

public class NotFoundExc extends Exception {

    public NotFoundExc(String message) {
        super(message);
    }

    public NotFoundExc() {
        super("poxos");
    }

}
