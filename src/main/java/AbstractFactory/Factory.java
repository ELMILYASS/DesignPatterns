package AbstractFactory;

public abstract class Factory {
    public Gpu buyGpu() {
        Gpu monitor = createGpu();
        monitor.power();
        return monitor;
    }
    public Monitor buyMonitor() {
        Monitor monitor = createMonitor();
        monitor.power();
        return monitor;
    }


    public abstract Monitor createMonitor() ;
    public abstract Gpu createGpu();
}
