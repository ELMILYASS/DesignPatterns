package FactoryMethod.CarExample;

public class USACarFactory extends CarFactory {
    @Override
    Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
            case MICRO:
                car = new MicroCar(Location.USA);
                break;

            case MINI:
                car = new MiniCar(Location.USA);
                break;

            default:
                break;

        }
        return car;
    }
}
