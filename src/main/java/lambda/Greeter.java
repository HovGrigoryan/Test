package lambda;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();

    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
