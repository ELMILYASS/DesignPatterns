package CarExample;

public class Client {
    public static void main(String[] args) {
        System.out.println(new CarFactory().buildCar(CarType.MICRO));
        System.out.println(new CarFactory().buildCar(CarType.MINI));


    }

}

