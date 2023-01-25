package designPattern.abstractFactory.factories;

import designPattern.abstractFactory.products.gpu.Gpu;
import designPattern.abstractFactory.products.monitor.Monitor;

public abstract class Company {

    public abstract Gpu createGpu();
    public abstract Monitor createMonitor();
}
