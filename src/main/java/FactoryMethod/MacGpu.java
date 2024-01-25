package FactoryMethod;

public class MacGpu implements Gpu {
    @Override
    public void power() {
        System.out.println("----------");
        System.out.println("MAC-GPU");
        System.out.println("----------");
    }
}
