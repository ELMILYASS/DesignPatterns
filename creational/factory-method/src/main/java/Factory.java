public abstract class Factory {
    public Gpu buyGPU() {
        Gpu gpu = createGPU();
        gpu.power();
        return gpu;
    }

    public abstract Gpu createGPU();
}
