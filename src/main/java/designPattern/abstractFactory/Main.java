package designPattern.abstractFactory;

import designPattern.abstractFactory.factories.AsusManufacturer;
import designPattern.abstractFactory.factories.Company;
import designPattern.abstractFactory.factories.MsiManufacturer;

public class Main {
    public static void main(String[] args) {
        Company msiCompany = new MsiManufacturer();
        msiCompany.createGpu();
        msiCompany.createMonitor();
        Company asusCompany = new AsusManufacturer();
        asusCompany.createMonitor();
        asusCompany.createGpu();
    }
}
