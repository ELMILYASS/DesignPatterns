public class Main {
    public static void main(String[] args) {
        HpGpuFactory hpGpuFactory = new HpGpuFactory();
        Gpu hpGpu = hpGpuFactory.buyGPU();

        MacGpuFactory macGpuFactory = new MacGpuFactory();
        Gpu macGpu = macGpuFactory.buyGPU();
    }

}
