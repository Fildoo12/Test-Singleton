package cz.spsmb.picek.singleton;

import java.util.ArrayList;
import java.util.List;
public class CarDealershipSingleton {
    private static CarDealershipSingleton singleton;
    private List<Car> orders;

    private CarDealershipSingleton() {
        orders = new ArrayList<>();
    }

    public static CarDealershipSingleton getInstance(){
        if (singleton == null){
            singleton = new CarDealershipSingleton();
        }
        return singleton;
    }

    public void orderCar(Car car){
        orders.add(car);
    }

    public void printOrders() {
        if (orders.isEmpty()){
            System.out.println("Zadne objednavky");
        } else{
            System.out.println("Seznam objednanych aut");
            for (Car car : orders){
                System.out.println(car.getDetails());
            }
        }
    }
}
