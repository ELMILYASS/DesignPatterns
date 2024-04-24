package MAC;


import resources.Factory;
import resources.Gpu;
import resources.Monitor;

public class MacFactory extends Factory {
    @Override
    public Monitor createMonitor() {
        return new MacMonitor();
    }

    @Override
    public Gpu createGpu() {
        return new MacGpu();
    }
}
