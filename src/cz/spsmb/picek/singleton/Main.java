package cz.spsmb.picek.singleton;

public class Main {

    public static void main(String[] args) {
        CarDealershipSingleton dealership = CarDealershipSingleton.getInstance();


        Car car1 = new Car.CarBuilder().setEngine("1.0L").setColor("red").setWheels("sport").build();
        Car car2 = new Car.CarBuilder().setEngine("2.0L") .setColor("blue") .setWheels("standard") .build();

        dealership.orderCar(car1);
        dealership.orderCar(car2);

        dealership.printOrders();

    }
}
