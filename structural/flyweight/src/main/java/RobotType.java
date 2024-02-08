public class RobotType {

    private final String model;
    private final String manufacturer;
    private final String otherData;

    public RobotType(String model, String manufacturer, String otherData) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.otherData = otherData;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getOtherData() {
        return otherData;
    }

    @Override
    public String toString() {
        return "RobotType{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", otherData='" + otherData + '\'' +
                '}';
    }
}