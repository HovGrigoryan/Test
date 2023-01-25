package designPattern.singleton;

public class Singleton {

    private static volatile Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        Singleton result = instance;

        if (result == null) {
            synchronized (Singleton.class) {
                if (result == null) {
                    instance = result = new Singleton();
                }
            }
        }
        return result;
    }



}
