package springComponent;

public class ConsoleLogger implements Logger{
    @Override
    public void write() {
        System.out.println("Write log to console");
    }
}
