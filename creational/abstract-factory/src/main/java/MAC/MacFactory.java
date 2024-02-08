package MAC;

import AbstractFactory.Factory;
import AbstractFactory.Gpu;
import AbstractFactory.Monitor;

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
