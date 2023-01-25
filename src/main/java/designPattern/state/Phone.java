package designPattern.state;

public class Phone {

    private State state;


    public Phone() {
        state = new OffState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public String lock() {
        return "Locking phone anr turning off the screen";
    }

    public String home() {
        return "Going to home-screen";
    }

    public String unlock() {
        return "unlocking the phone to home";
    }

    public String turnOn() {
        return "turning screen on, device still locked";
    }


    public String clickHome() {
        return state.onHome();
    }

    public String clickPower() {
        return state.onOffOn();
    }
}
