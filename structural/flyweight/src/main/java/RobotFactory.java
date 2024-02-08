import java.util.HashMap;
import java.util.Map;

public class RobotFactory {

    private static final Map<String, RobotType> robotTypes = new HashMap<>();

    public static RobotType getRobotType(String model, String manufacturer, String otherData) {
        if (robotTypes.get(model) == null) {
            robotTypes.put(model, new RobotType(model, manufacturer, otherData));
        }
        return robotTypes.get(model);
    }
}