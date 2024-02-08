
import java.util.List;
import java.util.Random;

public class MainApp {
    private static final int ROBOT_MODELS = 3;
    private static final int ROBOTS_TO_PRODUCE = 10000;

    public static void main(String[] args) {

        Store factory = new Store();
        for (int i = 0; i < ROBOTS_TO_PRODUCE / ROBOT_MODELS; i++) {
            factory.produceRobot(getRandomSerialNumber(), getRandomPrice(), "Model X", "Company A", "Special");
            factory.produceRobot(getRandomSerialNumber(), getRandomPrice(), "Model Y", "Company B", "General");
            factory.produceRobot(getRandomSerialNumber(), getRandomPrice(), "Model Z", "Company C", "Standard");
        }
        System.out.println(ROBOTS_TO_PRODUCE + " Robots Produced");
        System.out.println("==========================================");
        System.out.println("Memory Usage: ");
        System.out.println("Robot Size (20 bytes) * " + ROBOTS_TO_PRODUCE + " + RobotTypes Size (30 bytes) * " + ROBOT_MODELS + "");
        System.out.println("==========================================");
        System.out.println("Total: " + ((ROBOTS_TO_PRODUCE * 20 + ROBOT_MODELS * 30) / 1024 / 1024) + "MB");
    }

    private static String getRandomSerialNumber() {
        List<String> serialNumbers = List.of("123456", "234567", "345678", "456789", "567890");
        return serialNumbers.get(new Random().nextInt(serialNumbers.size()));
    }

    private static double getRandomPrice() {
        return new Random().nextDouble() * (200 - 10) + 10;
    }
}
