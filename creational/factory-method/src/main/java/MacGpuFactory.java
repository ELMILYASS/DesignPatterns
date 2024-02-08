public class MacGpuFactory extends Factory{
    @Override
    public Gpu createGPU() {
        return new MacGpu();
    }
}
