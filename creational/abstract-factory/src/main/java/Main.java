import HP.HpFactory;
import MAC.MacFactory;
import resources.Gpu;
import resources.Monitor;

public class Main {
    public static void main(String[] args) {
        HpFactory hpFactory = new HpFactory();
        Gpu hpGpu = hpFactory.buyGpu();
        Monitor hpMonitor = hpFactory.buyMonitor();
        System.out.println("+++++++++++");
        MacFactory macFactory = new MacFactory();
        Gpu macGpu = macFactory.buyGpu();
        Monitor macMonitor = macFactory.buyMonitor();
    }

}
