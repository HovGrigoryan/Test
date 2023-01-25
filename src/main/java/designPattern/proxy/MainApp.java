package designPattern.proxy;

import designPattern.proxy.internet.Internet;
import designPattern.proxy.internet.ProxyInternet;

public class MainApp {

    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("banned.com");

        System.out.println("==============");
    }
}
