package HP;

import AbstractFactory.Monitor;

public class HpMonitor implements Monitor {
    @Override
    public void power() {
        System.out.println("----------");
        System.out.println("HP-Monitor");
        System.out.println("----------");
    }
}
