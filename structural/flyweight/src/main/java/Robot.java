public class Robot {

    private final String serialNumber;
    private final double price;
    private final RobotType type;

    public Robot(String serialNumber, double price, RobotType type) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.type = type;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public RobotType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "serialNumber='" + serialNumber + '\'' +
                ", price=" + price +
                ", type=" + type +
                '}';
    }
}