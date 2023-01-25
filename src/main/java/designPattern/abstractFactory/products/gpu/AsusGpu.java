package designPattern.abstractFactory.products.gpu;

public class AsusGpu implements Gpu{
    @Override
    public void assemble() {
        System.out.println("Assembling ASU GPU");
    }
}
