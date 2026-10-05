package vroom.src;

import java.util.ArrayList;

import vroom.src.cars.Car;
import vroom.src.cars.Drone;
import vroom.src.cars.FleetManager;
import vroom.src.cars.Truck;
import vroom.src.cars.Vehicle;

public class Main {
  public static void main(String[] args) {
  
    Car car = new Car("5-12", 4);
    Truck truckNoTrailer = new Truck("55-1", 1000, false);
    Truck truckTrailer = new Truck("2-08", 1000, true);
    Drone drone = new Drone("3-12", 50);
    ArrayList<Vehicle> vehicles = new ArrayList<>();
    vehicles.add(car);
    vehicles.add(truckNoTrailer);
    vehicles.add(drone);
    FleetManager fleet = new FleetManager();
    fleet.startDelivery(vehicles);

    System.out.println(truckNoTrailer.getMaxCapacityKg());
    System.out.println(truckTrailer.getMaxCapacityKg());
    
  }
}
