package HP;


import resources.Factory;
import resources.Gpu;
import resources.Monitor;

public class HpFactory extends Factory {
    @Override
    public Monitor createMonitor() {

        return new HpMonitor();
    }

    @Override
    public Gpu createGpu() {
        return new HpGpu();
    }
}
