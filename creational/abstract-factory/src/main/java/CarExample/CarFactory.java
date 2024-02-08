package CarExample;

 class CarFactory {
     // We can add another product in relation with the Car
     CarFactory()
    {

    }
     Car buildCar(CarType type) {
         Car car = null;
         // We can add any GPS Function here which
         // read location property somewhere from configuration
         // and use location specific car factory
         // Currently I'm just using INDIA as Location
         //Logic
         Location location = Location.INDIA;

         switch(location)
         {
             case USA:
                 car = new USACarFactory().buildCar(type);
                 break;

             case INDIA:
                 car = new INDIACarFactory().buildCar(type);
                 break;

         }

         return car;

     };


}
