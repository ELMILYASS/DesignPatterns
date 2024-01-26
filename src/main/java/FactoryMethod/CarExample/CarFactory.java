package FactoryMethod.CarExample;

abstract class CarFactory {
     CarFactory()
    {

    }
    abstract Car buildCar(CarType type) ;


}
