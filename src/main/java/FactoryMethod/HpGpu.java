package FactoryMethod;

public class HpGpu implements Gpu {
    @Override
    public void power() {
        System.out.println("***********");
        System.out.println("HP-GPU");
        System.out.println("***********");
    }
}
