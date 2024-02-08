
import java.util.ArrayList;
import java.util.List;

public class Store {

    private final List<Robot> robots = new ArrayList<>();

    public void produceRobot(String serialNumber, double price, String model, String manufacturer, String otherData) {
        RobotType robotType = RobotFactory.getRobotType(model, manufacturer, otherData);
        robots.add(new Robot(serialNumber, price, robotType));
    }

    public void displayRobots() {
        robots.forEach(System.out::println);
    }

}

