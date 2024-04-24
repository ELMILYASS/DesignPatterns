package resources;

import resources.Gpu;

public abstract class Factory {
    public Gpu buyGpu() {
        Gpu gpu = createGpu();
        gpu.power();
        return gpu;
    }

    public Monitor buyMonitor() {
        Monitor monitor = createMonitor();
        monitor.power();
        return monitor;
    }

    public abstract Monitor createMonitor();

    public abstract Gpu createGpu();
}
