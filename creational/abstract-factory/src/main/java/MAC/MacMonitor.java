package MAC;


import resources.Monitor;

public class MacMonitor implements Monitor {
    @Override
    public void power() {
        System.out.println("----------");
        System.out.println("MAC-Monitor");
        System.out.println("----------");
    }
}
