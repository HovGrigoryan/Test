package designPattern.abstractFactory.factories;

import designPattern.abstractFactory.products.gpu.AsusGpu;
import designPattern.abstractFactory.products.gpu.Gpu;
import designPattern.abstractFactory.products.monitor.AsusMonitor;
import designPattern.abstractFactory.products.monitor.Monitor;

public class AsusManufacturer extends Company{
    @Override
    public Gpu createGpu() {
        return new  AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new  AsusMonitor();
    }
}
