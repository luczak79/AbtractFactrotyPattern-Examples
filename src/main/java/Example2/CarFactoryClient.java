package Example2;

public class CarFactoryClient {
    public static void main(String[] args) {
        CarFactory northAmericaFactory = new NorthAmericaCarFactory();
        Car northAmericaCar = northAmericaFactory.createCar();
        CarSpecification northAmericaSpec = northAmericaFactory.createCarSpecification();

        northAmericaCar.assemble();
        northAmericaSpec.display();

        CarFactory europeFactory = new EuropeCarFactory();
        Car europeCar = europeFactory.createCar();
        CarSpecification europeSpec = europeFactory.createCarSpecification();

        europeCar.assemble();
        europeSpec.display();
    }
}
