package FactoryMethod.CarExample;

public class Client {
    public static void main(String[] args) {
        System.out.println(new INDIACarFactory().buildCar(CarType.MICRO));
        System.out.println(new USACarFactory().buildCar(CarType.MINI));

    }

}

