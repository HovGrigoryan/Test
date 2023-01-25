package designPattern.abstractFactory.factories;

import designPattern.abstractFactory.products.gpu.AsusGpu;
import designPattern.abstractFactory.products.gpu.Gpu;
import designPattern.abstractFactory.products.gpu.MsiGpu;
import designPattern.abstractFactory.products.monitor.AsusMonitor;
import designPattern.abstractFactory.products.monitor.Monitor;
import designPattern.abstractFactory.products.monitor.MsiMonitor;

public class MsiManufacturer extends Company{
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
