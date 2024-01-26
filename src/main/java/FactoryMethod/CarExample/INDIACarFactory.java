package FactoryMethod.CarExample;

public class INDIACarFactory extends CarFactory{
    @Override
    Car buildCar(CarType model) {
        Car car = null;
        switch (model)
        {
            case MICRO:
                car = new MicroCar(Location.INDIA);
                break;

            case MINI:
                car = new MiniCar(Location.INDIA);
                break;

            default:
                break;

        }
        return car;

    }
}
