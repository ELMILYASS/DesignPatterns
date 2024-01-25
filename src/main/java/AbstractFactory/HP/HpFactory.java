package AbstractFactory.HP;

import AbstractFactory.Factory;
import AbstractFactory.Gpu;
import AbstractFactory.Monitor;

public class HpFactory extends Factory {
    @Override
    public Monitor createMonitor() {

        return  new HpMonitor();
    }

    @Override
    public Gpu createGpu() {
        return new HpGpu();
    }
}
