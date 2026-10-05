package vroom.src;

import vroom.src.cars.Car;
import vroom.src.cars.Drone;
import vroom.src.cars.Truck;

public class Main {
  public static void main(String[] args) {
  
    Car car = new Car("5-12", 4);
    Truck truckNoTrailer = new Truck("55-1", 1000, false);
    Truck truckTrailer = new Truck("2-08", 1000, true);
    Drone drone = new Drone("3-12", 50);

    System.out.println(truckNoTrailer.getMaxCapacityKg());
    System.out.println(truckTrailer.getMaxCapacityKg());
  }
}
