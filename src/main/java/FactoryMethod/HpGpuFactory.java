package FactoryMethod;

public class HpGpuFactory extends Factory {
    @Override
    public Gpu createGPU() {
        return new HpGpu();
    }
}
